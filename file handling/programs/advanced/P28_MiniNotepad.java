package advanced;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * AIM: Mini Notepad Application (Mock CLI-based file saver).
 */
public class P28_MiniNotepad {
    public static void saveNote(String filename, String content) {
        try (PrintWriter pw = new PrintWriter(new FileWriter(filename))) {
            pw.print(content);
            System.out.println("Note saved successfully to " + filename);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        String mockNotepadContent = "Important tasks:\n1. Revise Java NIO.2\n2. Solve practice MCQs";
        saveNote("my_notepad_note.txt", mockNotepadContent);
    }
}
