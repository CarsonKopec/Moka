package moka.toml.validation;

import moka.toml.annotations.Exclude;
import moka.toml.annotations.Required;
import moka.toml.exception.MissingFieldException;

import java.lang.reflect.Field;

public class ManifestValidator {

    public static void validate(Object root) {
        validateObject(root, "manifest", root.getClass().isAnnotationPresent(Required.class));
    }

    private static void validateObject(Object obj, String path, boolean parentIsRequired) {
        if (obj == null) return;

        for (Field field : obj.getClass().getDeclaredFields()) {
            field.setAccessible(true);

            if (field.isAnnotationPresent(Exclude.class)) continue;

            boolean isFieldRequired = field.isAnnotationPresent(Required.class) || parentIsRequired;

            try {
                Object value = field.get(obj);
                String fullPath = path + "." + field.getName();

                if (isFieldRequired && value == null) {
                    throw new MissingFieldException(fullPath);
                }

                if (value != null && !isPrimitiveOrWrapper(field.getType()) && !field.getType().isEnum()) {
                    validateObject(value, fullPath, field.isAnnotationPresent(Required.class));
                }
            } catch (IllegalAccessException e) {
                throw new RuntimeException("Validation error: " + e.getMessage(), e);
            }
        }
    }

    private static boolean isPrimitiveOrWrapper(Class<?> type) {
        return type.isPrimitive()
                || type == String.class
                || Number.class.isAssignableFrom(type)
                || type == Boolean.class
                || type == Character.class;
    }
}
