# Binary Files vs Text Files in Java

## Overview

**Text Files** store data in human-readable format using character encoding (UTF-8, ASCII, etc.), while **Binary Files** store data in raw binary format that requires specific programs to interpret.

## Key Differences

| Aspect | Text File | Binary File |
|--------|-----------|-------------|
| **Format** | Character-based (readable) | Byte-based (not readable) |
| **Encoding** | Uses character encoding | No encoding needed |
| **Size** | Generally larger | More compact |
| **Examples** | `.txt`, `.csv`, `.xml` | `.jpg`, `.exe`, `.dat` |

## Handling Text Files in Java

### Reading Text Files

```java
import java.io.*;

// Using BufferedReader
try (BufferedReader reader = new BufferedReader(new FileReader("file.txt"))) {
    String line;
    while ((line = reader.readLine()) != null) {
        System.out.println(line);
    }
} catch (IOException e) {
    e.printStackTrace();
}
```

### Writing Text Files

```java
try (BufferedWriter writer = new BufferedWriter(new FileWriter("file.txt"))) {
    writer.write("Hello World");
    writer.newLine();
} catch (IOException e) {
    e.printStackTrace();
}
```

## Handling Binary Files in Java

### Reading Binary Files

```java
try (FileInputStream fis = new FileInputStream("file.dat");
     DataInputStream dis = new DataInputStream(fis)) {
    int data = dis.readInt();
    double value = dis.readDouble();
} catch (IOException e) {
    e.printStackTrace();
}
```

### Writing Binary Files

```java
try (FileOutputStream fos = new FileOutputStream("file.dat");
     DataOutputStream dos = new DataOutputStream(fos)) {
    dos.writeInt(42);
    dos.writeDouble(3.14);
} catch (IOException e) {
    e.printStackTrace();
}
```

## When to Use Which?

- **Text Files**: Configuration files, logs, human-editable data
- **Binary Files**: Images, executables, serialized objects, performance-critical data
