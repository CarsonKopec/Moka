# ☕ Moka

Moka is a modern, simple Java package manager and build tool — kind of like `npm` or `cargo`, but for Java.  
It uses `moka.toml` instead of massive XML files or super nested build scripts.  
If you're tired of Maven or Gradle over-complicating your life, Moka's for you.

---

## 🚀 What is Moka?

Moka is built to be:

- ✨ **Minimal** — No magic, no bloated DSLs.
- ⚡ **Fast** — Native-first with GraalVM support.
- 📦 **Flexible** — Modular workspaces, lockfiles, optional Lua scripting.
- 🔨 **Familiar** — Think `cargo`, but for Java devs.

---

## 📁 Project Structure

Here’s what a typical Moka project looks like:


```
myapp/
├── moka.toml | project.moka             # Project manifest
├── moka.lock              # Auto-generated lockfile
├── src/                   # Java sources
├── modules/               # Optional submodules
│   └── cli/
│       └── moka.toml      # Submodule manifest
└── scripts/
└── build.moka.lua     # Optional Lua build/test scripts

```
---

## 📦 `moka.toml | project.moka` – Your Manifest

```toml
[project]
name = "myapp"
version = "0.1.0"
description = "A modern Java CLI tool"
main = "com.example.Main"
jdk = 21
members = ["modules/core", "modules/cli"]

[dependencies]
picocli = ">=4.5, <5.0"

[build]
output = ["jar", "fatJar", "native"]

[features]
default = ["logging"]

[repositories]
central = @MavenCentral
jitpack = "<https://jitpack.io>"
````

---

## 🧩 What's a `.moka` file?

Besides the `moka.toml` file, you can use custom `.moka` files — basically **enhanced TOML** with support for annotations, presets, and your own conventions.

Think of it as TOML++, purpose-built for Moka. You can define aliases, magic constants like `@LatestLTS`, or inject reusable patterns to cut down repetition.

They’re parsed like TOML but processed by Moka’s own loader.

Examples:

```toml
version = "@LatestLTS"             # Resolve to JDK 21
preset = "@preset:web-backend"     # Expand to default deps/features
```
---

## ⚙️ Scripts (optional)

You can write **Lua scripts** to customize how your project builds, tests, or deploys.

```lua
-- scripts/build.moka.lua

println("building...")
run("javac src/**/*.java")
```

Reference it in `moka.toml`:

```toml
[scripts]
build = "scripts/build.moka.lua"
test = "scripts/test.moka.lua"
```

Want to define your own Lua functions that talk to Java? Go wild — we support embedding Moka-specific Lua APIs.

---

## 🛠 Commands (coming soon!)

| Command         | Description                                      |
|-----------------|--------------------------------------------------|
| `moka init`     | Create a new project (CLI, API, lib, game, etc.) |
| `moka run`      | Instantly run a Java file or project             |
| `moka build`    | Build the project (JAR or native image)          |
| `moka test`     | Run tests with JUnit/TestNG                      |
| `moka add`      | Add a Maven/Gradle dependency to the project     |
| `moka search`   | Search Maven Central for libraries               |
| `moka template` | Inject templates (Dockerfile, GitHub CI, etc.)   |
| `moka doctor`   | Diagnose your Java setup (JDK, tools, versions)  |
| `moka update`   | Update to the latest version of `moka`           |
---

## 🔮 Why Moka?

Because Java devs deserve a clean, modern, battery-included tool that doesn't take a PhD in XML to use.
Moka is opinionated, scriptable, and fun. Let’s ditch the boilerplate together. ☕✨

---

## 🧪 Status

Still early. We're figuring things out. But it's working and growing fast.

```
git clone https://github.com/imagineforgee/moka
cd moka
./gradlew build
```

---

## 🗺 Roadmap

* [x] TOML-based manifest
* [x] Lockfile support
* [x] Modular project layout
* [x] Lua script integration
* [x] `.moka` format extension
* [ ] Dependency resolution
* [ ] CLI runner
* [ ] Native-image integration

---

## 🤝 Contributing

Ideas? Bugs? Jokes? Open an issue or PR — we’re building this together.

---

## 📛 Naming

Moka ≈ Mocha but more Java. It’s a name. It’s a vibe. ☕

