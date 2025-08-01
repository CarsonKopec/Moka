package moka.util;

import com.github.mustachejava.DefaultMustacheFactory;
import com.github.mustachejava.Mustache;
import com.github.mustachejava.MustacheFactory;

import java.io.*;
import java.nio.file.Path;
import java.util.Map;

public class TemplateService {
    public static void render(String templatePath, Map<String, Object> context, Path outputPath) throws IOException {
        MustacheFactory mf = new DefaultMustacheFactory();

        try (InputStream templateStream = TemplateService.class.getClassLoader().getResourceAsStream(templatePath)) {
            if (templateStream == null) throw new FileNotFoundException("Template " + templatePath + " not found");
            Mustache mustache = mf.compile(new InputStreamReader(templateStream), templatePath);
            try (Writer writer = new BufferedWriter(new OutputStreamWriter(new FileOutputStream(outputPath.toFile())))) {
                mustache.execute(writer, context).flush();
            }
        }
    }
}
