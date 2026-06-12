# Practice Section: Java File Handling Question Bank

---

## 1. Multiple Choice Questions (MCQs)

1. **Which package contains the classes representing file streams in Java?**
   - A) `java.lang`
   - B) `java.io`
   - C) `java.nio`
   - D) Both B and C
   - **Answer**: D

2. **Which class is the superclass of all input byte streams?**
   - A) `Reader`
   - B) `InputStream`
   - C) `File`
   - D) `FileInputStream`
   - **Answer**: B

3. **Which method of the File class creates an empty file?**
   - A) `createFile()`
   - B) `createNewFile()`
   - C) `makeFile()`
   - D) `newFile()`
   - **Answer**: B

4. **Which stream is designed for reading characters?**
   - A) `FileInputStream`
   - B) `Reader`
   - C) `DataInputStream`
   - D) `ObjectInputStream`
   - **Answer**: B

5. **To append data using FileWriter, which constructor option is used?**
   - A) `new FileWriter("file.txt")`
   - B) `new FileWriter("file.txt", true)`
   - C) `new FileWriter("file.txt", "append")`
   - D) `new FileWriter("file.txt", false)`
   - **Answer**: B

*(Remaining 15 MCQs structured similarly with exact answers...)*

---

## 2. Short Answer Questions (with Answers)

1. **What is a stream in Java?**
   - **Answer**: A stream is a logical sequence of data flowing from a source (like input stream) to a destination (like output stream).

2. **What is the difference between path and absolute path?**
   - **Answer**: A relative path is resolved relative to the current working directory, whereas an absolute path represents the complete path starting from the root of the file system.

3. **Why do we close file streams?**
   - **Answer**: Closing streams releases system resources such as file handles and memory locks held by the OS.

*(Remaining 17 Short Questions covering serialization, buffering, NIO, and try-with-resources...)*

---

## 3. Long Answer Questions

1. **Explain the Java Stream Hierarchy with a neat structure diagram.**
2. **Explain the concept of Object Serialization and Deserialization in detail. Mention the role of serialVersionUID and transient keyword.**
3. **Compare Traditional IO (`java.io`) and New IO (`java.nio`). Explain the benefits of channels and buffers.**

---

## 4. Programming Exercises
1. Write a Java program to count vowel occurrences in a file.
2. Write a program to read a configuration `.properties` file.
3. Write a program to encrypt a text file by shifting characters by 3 (Caesar Cipher).
4. Write a program that searches for a keyword in all text files in a directory.
5. Create a CSV file and load its data into an array of custom Student objects.
