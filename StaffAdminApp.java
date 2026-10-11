import java.util.List;

// --- ABSTRACTION ---
interface IConsoleApplication {
    void run();
}

public class StaffAdminApp implements IConsoleApplication {
    // ENCAPSULATION: Maintains state privately
    private static Staff currentStaff = null;

    public static void main(String[] args) {
        new StaffAdminApp().run();
    }

    // POLYMORPHISM/ABSTRACTION: Implementing interface contract
    @Override
    public void run() {
        // TODO: Initialize BCSDataManager and implement the main system login loop
    }

    // ENCAPSULATION: Internal system functions are private
    private static void dashboard() {
        // TODO: Implement the menu routing based on currentStaff.getRoleLevel()
    }

    private static void processEservices() {
        // TODO: Load EService requests, filter "Pending", process approvals/rejections
    }

    private static void processBlotters() {
        // TODO: Display and process Blotter reports
    }

    private static void dispatchFleet() {
        // TODO: Handle Transport requests and assign fleet drivers
    }

    private static void verifyResidents() {
        // TODO: View unverified residents and flag or verify them
    }

    private static void showKPIs() {
        // TODO: Tally residents, requests, and blotters for admin view
    }

    private static void manageContent() {
        // TODO: Allow admins to create new Civic Announcements
    }

    private static void showAuditLog() {
        // TODO: Read and display the activity log
    }
}