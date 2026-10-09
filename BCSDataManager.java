import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;

// --- ABSTRACTION: Interfaces defining distinct operational contracts ---
interface IDataRepository {
    void initialize();
    List<String[]> readCSV(String fileName);
    void saveLine(String fileName, String line);
    void rewriteUsers(List<User> users);
    void rewriteRequests(List<ServiceRequest> reqs);
    void logActivity(String actor, String role, String action, String target, String ref, String badge);
}

interface IConsoleUtils {
    void printHeader(String title);
    String readString(String prompt);
    int readInt(String prompt, int min, int max);
    void exitIfRequested(int choice);
    void pauseForReturn(String prompt);
    LocalDate readDate(String prompt);
}

// --- INHERITANCE: Implementing multiple interfaces for specific behaviors ---
public class BCSDataManager implements IDataRepository, IConsoleUtils {

    // ENCAPSULATION: Hiding internal state, directory paths, and the scanner
    private static final String DIR = "./data/";
    private Scanner scanner;
    
    // ENCAPSULATION: Singleton instance variable
    private static BCSDataManager instance;

    // ENCAPSULATION: Private constructor prevents direct instantiation
    private BCSDataManager() {
        this.scanner = new Scanner(System.in);
    }

    // Global Access Point for the Singleton instance
    public static BCSDataManager getInstance() {
        if (instance == null) {
            instance = new BCSDataManager();
        }
        return instance;
    }

    // --- IDataRepository Implementation (POLYMORPHISM: Method Overriding) ---
    
    @Override
    public void initialize() { 
        // TODO: Create directories and seed core files (users.csv, service_requests.csv, etc.)
    }

    // ENCAPSULATION: Helper method hidden from external applications
    private void seedFile(String fileName, String defaultContent) { 
        // TODO: Check if file exists, if not, write defaultContent
    }

    @Override
    public List<String[]> readCSV(String fileName) { 
        // TODO: Open file, skip header, split by "|", and return List of arrays
        return null; 
    }

    @Override
    public void saveLine(String fileName, String line) { 
        // TODO: Append a single line to the specified CSV file
    }

    @Override
    public void rewriteUsers(List<User> users) { 
        // TODO: Read header, overwrite users.csv with each User's toCSV() output
    }

    @Override
    public void rewriteRequests(List<ServiceRequest> reqs) { 
        // TODO: Read header, overwrite service_requests.csv with each ServiceRequest's toCSV() output
    }

    @Override
    public void logActivity(String actor, String role, String action, String target, String ref, String badge) { 
        // TODO: Format string with LocalDate.now() and append to activity_log.csv
    }

    // --- IConsoleUtils Implementation (POLYMORPHISM: Method Overriding) ---

    @Override
    public void printHeader(String title) { 
        // TODO: Print formatted application headers
    }

    @Override
    public String readString(String prompt) { 
        // TODO: Loop until valid, non-empty string without "|" is provided
        return null; 
    }

    @Override
    public int readInt(String prompt, int min, int max) { 
        // TODO: Loop, parse integer, and validate it falls between min and max bounds
        return 0; 
    }

    @Override
    public void exitIfRequested(int choice) { 
        // TODO: Terminate application (System.exit) if choice is 0
    }

    @Override
    public void pauseForReturn(String prompt) { 
        // TODO: Wait for user input to return or exit
    }

    @Override
    public LocalDate readDate(String prompt) { 
        // TODO: Prompt for MM/dd/yyyy and parse into LocalDate
        return null; 
    }
}