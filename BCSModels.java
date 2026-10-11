import java.time.LocalDate;

// --- ABSTRACTION ---
interface CSVExportable {
    String toCSV();
}

// --- ABSTRACTION & INHERITANCE ---
abstract class User implements CSVExportable {
    // ENCAPSULATION: Protected fields accessible to children, hidden from the public
    protected String userId, emailOrMobile, password, firstName, middleName, lastName, suffix, accountStatus;

    // POLYMORPHISM: Overloaded constructors
    public User(String id, String email, String pass, String fName, String mName, String lName, String sfx, String status) { /* TODO */ }
    public User(String id, String email, String pass, String fName, String lName, String status) { /* TODO */ }

    // ENCAPSULATION: Getters and Setters
    public String getUserId() { /* TODO */ return null; }
    public String getFullName() { /* TODO */ return null; }
    public String getEmailOrMobile() { /* TODO */ return null; }
    public String getPassword() { /* TODO */ return null; }
    public String getAccountStatus() { /* TODO */ return null; }
    public void setAccountStatus(String accountStatus) { /* TODO */ }

    @Override
    public abstract String toCSV();
}

class Resident extends User {
    // ENCAPSULATION: Private fields specific to Resident
    private String dob, gender, civilStatus, houseUnitNo, street, barangay, city, voterOrIdType, validIdFile, householdNo;
    private int yearsInBrgy;
    private boolean isVerified;

    public Resident(String[] data) { super(data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[17]); /* TODO */ }
    public Resident(String id, String email, String password, String firstName, String lastName) { super(id, email, password, firstName, lastName, "PENDING VERIFICATION"); /* TODO */ }

    public boolean isVerified() { /* TODO */ return false; }
    public void setVerified(boolean verified) { /* TODO */ }
    public String getAddress() { /* TODO */ return null; }

    // POLYMORPHISM: Overriding abstract method
    @Override
    public String toCSV() { /* TODO */ return null; }
}

class Staff extends User {
    private String position, department;
    private int roleLevel; 

    public Staff(String[] data) { super(data[1], data[2], data[3], data[4], data[5], data[6], data[7], data[17]); /* TODO */ }
    public Staff(String id, String email, String password, String firstName, String lastName, String position, String department, int roleLevel) { super(id, email, password, firstName, lastName, "Active"); /* TODO */ }

    public int getRoleLevel() { /* TODO */ return 0; }
    public String getPosition() { /* TODO */ return null; }

    @Override
    public String toCSV() { /* TODO */ return null; }
}

abstract class ServiceRequest implements CSVExportable {
    protected String requestId, residentId, requestDate, status, remarks;

    public ServiceRequest(String reqId, String resId, String date, String stat, String rem) { /* TODO */ }
    public ServiceRequest(String reqId, String resId, String date, String stat) { /* TODO */ }

    public String getRequestId() { /* TODO */ return null; }
    public String getResidentId() { /* TODO */ return null; }
    public String getStatus() { /* TODO */ return null; }
    public void setStatus(String status) { /* TODO */ }

    @Override
    public abstract String toCSV();
}

class EService extends ServiceRequest {
    private String docType, purpose, completeAddress, controlNumber, pickupDate, paymentStatus;
    private double fee;

    public EService(String[] d) { super(d[1], d[2], d[3], d[7], d[11]); /* TODO */ }
    public EService(String requestId, String residentId, String requestDate, String docType, String purpose, String completeAddress, double fee) { super(requestId, residentId, requestDate, "Pending"); /* TODO */ }

    public String getDocType() { /* TODO */ return null; }

    @Override
    public String toCSV() { /* TODO */ return null; }
}

class TransportRequest extends ServiceRequest {
    private String reason, destination, scheduledDate, assignedDriver, plateNo, vehicleType;

    public TransportRequest(String[] d) { super(d[1], d[2], d[3], d[7], d[11]); /* TODO */ }
    public TransportRequest(String requestId, String residentId, String requestDate, String reason, String vehicleType, String destination, String scheduledDate) { super(requestId, residentId, requestDate, "Pending"); /* TODO */ }

    public void assignFleet(String driver, String plate) { /* TODO */ }
    public String getScheduledDate() { /* TODO */ return null; }

    @Override
    public String toCSV() { /* TODO */ return null; }
}

abstract class IncidentReport implements CSVExportable {
    protected String reportId, reporterId, reportDate, title, location, description, status, priority;

    public IncidentReport(String id, String rId, String date, String t, String loc, String desc, String stat, String prio) { /* TODO */ }
    public IncidentReport(String id, String rId, String date, String t, String loc, String desc, String stat) { /* TODO */ }

    public String getReportId() { /* TODO */ return null; }
    public String getStatus() { /* TODO */ return null; }
    public void setStatus(String status) { /* TODO */ }

    @Override
    public abstract String toCSV();
}

class BlotterReport extends IncidentReport {
    private String category, respondent, assignedOfficer, hearingDate;
    private boolean isConfidential;

    public BlotterReport(String[] d) { super(d[0], d[1], d[2], d[5], d[6], d[7], d[10], d[9]); /* TODO */ }
    public BlotterReport(String id, String reporterId, String reportDate, String category, String title, String location, String description, String respondent, String priority) { super(id, reporterId, reportDate, title, location, description, "Pending", priority); /* TODO */ }

    public void assignOfficer(String officer) { /* TODO */ }

    @Override
    public String toCSV() { /* TODO */ return null; }
}

// --- STRICT ENCAPSULATION IMPLEMENTED ---
// Previously public fields are now private. You must create getters/setters for them.
class Announcement implements CSVExportable {
    private String id, title, category, message, postDate;
    private boolean isPinned;

    public Announcement(String[] d) { /* TODO */ }
    public Announcement(String id, String title, String category, String message, String postDate) { /* TODO */ }
    
    // TODO: Add Getters and Setters

    @Override
    public String toCSV() { /* TODO */ return null; }
}

class LocalBusiness {
    private String id, name, category, permitNo, status;

    public LocalBusiness(String[] d) { /* TODO */ }
    public LocalBusiness(String id, String name, String category, String permitNo, String status) { /* TODO */ }
    
    // TODO: Add Getters and Setters
}

class EmergencyHotline {
    private String name, service, number;

    public EmergencyHotline(String[] d) { /* TODO */ }
    public EmergencyHotline(String name, String service, String number) { /* TODO */ }
    
    // TODO: Add Getters and Setters
}