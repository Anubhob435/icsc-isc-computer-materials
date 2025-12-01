## 1. **Introduction to File Handling in Java**

File handling is the mechanism of storing the output of a program in a file and performing various operations like reading, writing, and modifying files. It’s vital for persistent data storage.

### Why File Handling?
- **Persistence**: Save the program’s results for future use or analysis.
- **External Data**: Programs can work with much larger data sets.
- **Sharing Data**: Files can be shared between programs or users.

***

## 2. **Types of Files in Java**
- **Text Files**: Store data in readable characters (like `.txt`); easy to view and edit with text editors.
- **Binary Files**: Store data in binary (like images, `.dat` files); not human-readable.

***

## 3. **Basic File Operations**
### a. **Creating a File**
Use the `File` class to declare and create files.

```java
import java.io.File;
File f = new File("example.txt");
f.createNewFile();  // creates a file if it does not exist
```
- Methods: `exists()`, `createNewFile()`, `delete()`, `length()`

### b. **Writing to Files**
- **Text Files**: Use `FileWriter` or `BufferedWriter` for efficient writing

```java
import java.io.FileWriter;
FileWriter fw = new FileWriter("example.txt");
fw.write("Hello, File Handling!");
fw.close();
```
- **Binary Files**: Use `FileOutputStream`

```java
import java.io.FileOutputStream;
FileOutputStream fos = new FileOutputStream("binaryfile.dat");
fos.write(65); // Writes byte 65 (A)
fos.close();
```

### c. **Reading from Files**
- **Text Files**: Use `FileReader` or `BufferedReader`

```java
import java.io.FileReader;
import java.io.BufferedReader;
BufferedReader br = new BufferedReader(new FileReader("example.txt"));
String line;
while((line = br.readLine()) != null) {
    System.out.println(line);
}
br.close();
```
- **Binary Files**: Use `FileInputStream`

```java
import java.io.FileInputStream;
FileInputStream fis = new FileInputStream("binaryfile.dat");
int i = fis.read();
while (i != -1) {
    System.out.println((char)i);
    i = fis.read();
}
fis.close();
```

***

## 4. **Important Classes and Their Usage**

| Class               | Text/Binary | Purpose                                       |
|---------------------|-------------|-----------------------------------------------|
| File                | Both        | To create, delete, get properties of files    |
| FileWriter          | Text        | Write to text files (character by character)  |
| FileReader          | Text        | Read from text files (character by character) |
| BufferedWriter      | Text        | Efficient writing to text files               |
| BufferedReader      | Text        | Efficient reading from text files             |
| FileOutputStream    | Binary      | Write to binary files (byte by byte)          |
| FileInputStream     | Binary      | Read from binary files (byte by byte)         |
| DataInputStream     | Binary      | Read Java primitive data from binary files    |
| DataOutputStream    | Binary      | Write Java primitive data to binary files     |

***

## 5. **Text File Operations: Examples**

**Creating and writing to a file:**
```java
FileWriter fw = new FileWriter("data.txt");
fw.write("ICSE File Handling Example");
fw.close();
```

**Reading from a file:**
```java
BufferedReader br = new BufferedReader(new FileReader("data.txt"));
String str;
while((str = br.readLine()) != null) {
    System.out.println(str);
}
br.close();
```

***

## 6. **Binary File Operations: Examples**

**Writing to a binary file:**
```java
FileOutputStream fos = new FileOutputStream("numbers.dat");
fos.write(123); // Byte value
fos.close();
```

**Reading from a binary file:**
```java
FileInputStream fis = new FileInputStream("numbers.dat");
int num = fis.read();
System.out.println(num);
fis.close();
```

***

## 7. **Handling Exceptions**

Always use **try-catch** or **try-with-resources** to prevent resource leaks and handle exceptions correctly.

```java
try (BufferedReader br = new BufferedReader(new FileReader("file.txt"))) {
    // File operations
} catch (IOException e) {
    e.printStackTrace();
}
```

***

## 8. **Common Questions (FAQs) for Exams**

1. **Differentiate between text file and binary file.**
2. **Which classes are used for file handling in Java?**
3. **How to read student records from a file?**
4. **Explain try-with-resources statement.**

***

## 9. **Best Practices**

- Always close files (`close()` method) to free up resources.
- Use **BufferedReader/BufferedWriter** for efficient text file processing.
- Catch exceptions during file operations.
- Prefer **try-with-resources** for automatic resource management (Java 7+).

***

## 10. **Summary Table**

| Operation        | Text File Class    | Binary File Class   |
|------------------|-------------------|--------------------|
| Read             | FileReader/BufferedReader | FileInputStream  |
| Write            | FileWriter/BufferedWriter | FileOutputStream |
| Primitive Types  | DataInputStream    | DataInputStream    |
|                  | DataOutputStream   | DataOutputStream   |

***

## 11. **Useful Code Patterns**

**Reading all lines at once (Java 8+):**
```java
Files.lines(Paths.get("file.txt")).forEach(System.out::println);
```

**Appending to a file:**
```java
FileWriter fw = new FileWriter("data.txt", true); // true for append
fw.write("Another line");
fw.close();
```

***

