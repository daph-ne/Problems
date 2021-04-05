import java.util.Iterator;
import java.util.Stack;

/**
 * Link - https://leetcode.com/problems/simplify-path/
 * Given a string path, which is an absolute path (starting with a slash '/') to a file or directory in a Unix-style file system, convert it to the simplified canonical path.
 *
 * In a Unix-style file system, a period '.' refers to the current directory, a double period '..' refers to the directory up a level, and any multiple consecutive slashes (i.e. '//') are treated as a single slash '/'. For this problem, any other format of periods such as '...' are treated as file/directory names.
 *
 * The canonical path should have the following format:
 *
 *     The path starts with a single slash '/'.
 *     Any two directories are separated by a single slash '/'.
 *     The path does not end with a trailing '/'.
 *     The path only contains the directories on the path from the root directory to the target file or directory (i.e., no period '.' or double period '..')
 *
 * Return the simplified canonical path.
*/
public class SimplifyPath {
    public String simplifyPath(String path) {
        Stack<String> result = new Stack<>();
        String out = "";
        String arr[] = path.split("/"); // separates and removes '/'

        for (String i:arr) {
            //  to move one level up at '..'
            if (!result.isEmpty() && i.equals("..")) {
                result.pop();
            } else if (!i.isEmpty() && !i.equals(".") && !i.equals("..")) {
                result.push(i);
            }
        }

        Iterator it = result.iterator();
        while (it.hasNext()) {
            String level = (String) it.next();
            out += "/" + level;
        }
        if (result.isEmpty()) {
            return "/";
        } else {
            return out;
        }
    }
}
