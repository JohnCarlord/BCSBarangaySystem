import java.time.LocalDate;
import java.util.List;

public class ResidentApp implements IConsoleApplication {
    // ENCAPSULATION: State is hidden from other classes
    private static Resident currentUser = null;

    public static void main(String[] args) {
        new ResidentApp().run();
    }

    // ABSTRACTION: Interface implementation
    @Override
    public void run() {
        // TODO: Initialize BCSDataManager, show login/register/exit menu, and route to dashboard
    }

    // ENCAPSULATION: Private helper functions
    private static void login() {
        // TODO: Prompt for credentials, validate against users.csv, set currentUser
    }

    private static void register() {
        // TODO: Gather user data, create new Resident object, save to users.csv
    }

    private static void dashboard() {
        // TODO: Display resident menu and route to specific handlers based on input
    }

    private static void handleEservices() {
        // TODO: Prompt for document type, fee, purpose, and create new EService
    }

    private static void handleBlotter() {
        // TODO: Prompt for incident details and create new BlotterReport
    }

    private static void handleTransport() {
        // TODO: Check booking date rules and create new TransportRequest
    }

    private static void handleHotlines() {
        // TODO: Load emergency hotlines and simulate dialing
    }

    private static void handleDirectory() {
        // TODO: Display local businesses
    }

    private static void viewHistory() {
        // TODO: Display user's specific service requests and incident reports
    }
}