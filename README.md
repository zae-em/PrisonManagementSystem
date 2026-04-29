# Prison Management System

A comprehensive JavaFX-based Prison Management System for managing inmates, staff, resources, medical records, incidents, and more.

## Features

The system includes the following modules:

1. **Register New Inmate** - Add new inmates to the system
2. **Manage Staff Records** - Add, update, and delete staff members
3. **Assign Work to Inmate** - Assign work tasks to inmates
4. **Manage Resources** - Track and manage prison resources
5. **Medical Checkup** - Record medical checkups for inmates
6. **Monitor Attendance** - Track inmate work attendance
7. **Record Incident Report** - Document incidents involving inmates
8. **Record Movement** - Track inmate movements within the facility
9. **Release Inmate** - Process inmate releases

## Project Structure

```
PrisonManagementSystem/
├── src/
│   └── main/
│       ├── java/
│       │   └── com/
│       │       └── prison/
│       │           ├── PrisonManagementApp.java (Main class)
│       │           ├── model/
│       │           │   ├── Inmate.java
│       │           │   ├── Staff.java
│       │           │   ├── WorkAssignment.java
│       │           │   ├── Resources.java
│       │           │   ├── MedicalCheckup.java
│       │           │   ├── IncidentReport.java
│       │           │   └── MovementRecord.java
│       │           ├── controller/
│       │           │   ├── MainMenuController.java
│       │           │   ├── RegisterInmateController.java
│       │           │   ├── ManageStaffController.java
│       │           │   ├── AssignWorkController.java
│       │           │   ├── ManageResourcesController.java
│       │           │   ├── MedicalCheckupController.java
│       │           │   ├── MonitorAttendanceController.java
│       │           │   ├── IncidentReportController.java
│       │           │   ├── RecordMovementController.java
│       │           │   └── ReleaseInmateController.java
│       │           └── util/
│       │               └── Database.java
│       └── resources/
│           └── fxml/
│               ├── MainMenu.fxml
│               ├── RegisterInmate.fxml
│               ├── ManageStaff.fxml
│               ├── AssignWork.fxml
│               ├── ManageResources.fxml
│               ├── MedicalCheckup.fxml
│               ├── MonitorAttendance.fxml
│               ├── IncidentReport.fxml
│               ├── RecordMovement.fxml
│               └── ReleaseInmate.fxml
├── compile.sh
├── run.sh
└── README.md
```

## Requirements

- Java Development Kit (JDK) 11 or higher
- JavaFX SDK 11 or higher

## Setup Instructions

### 1. Download JavaFX

Download JavaFX SDK from: https://gluonhq.com/products/javafx/

Extract it to a location on your system (e.g., `/path/to/javafx-sdk-21`)

### 2. Set JavaFX Path

Open `compile.sh` and `run.sh` files and replace `$PATH_TO_FX` with your JavaFX lib path:

```bash
# Example:
PATH_TO_FX="/path/to/javafx-sdk-21/lib"
```

### 3. Make Scripts Executable

```bash
chmod +x compile.sh
chmod +x run.sh
```

### 4. Compile the Project

```bash
./compile.sh
```

### 5. Run the Application

```bash
./run.sh
```

## Running in VS Code

### Option 1: Using Command Line
1. Open terminal in VS Code
2. Navigate to project directory
3. Run `./compile.sh` followed by `./run.sh`

### Option 2: Using VS Code Launch Configuration

Create `.vscode/launch.json`:

```json
{
    "version": "0.2.0",
    "configurations": [
        {
            "type": "java",
            "name": "Prison Management System",
            "request": "launch",
            "mainClass": "com.prison.PrisonManagementApp",
            "projectName": "PrisonManagementSystem",
            "vmArgs": "--module-path /path/to/javafx-sdk-21/lib --add-modules javafx.controls,javafx.fxml"
        }
    ]
}
```

Replace `/path/to/javafx-sdk-21/lib` with your actual JavaFX path.

## Database

The application uses an in-memory database (HashMap-based) for demonstration purposes. Sample data is automatically loaded on startup.

To persist data, you can extend the `Database.java` class to use:
- File-based storage (serialization)
- SQLite database
- MySQL/PostgreSQL database

## Usage Guide

### Main Menu
The main menu provides access to all system modules. Click any button to open the respective module.

### Register New Inmate
1. Fill in all required fields (Name, Age, Gender, Crime, etc.)
2. Select admission and release dates
3. Click "Register" to save

### Manage Staff Records
1. Click "Add New Staff" to add new staff members
2. Select a staff member from the table and click "Update Selected" to modify
3. Click "Delete Selected" to remove a staff member

### Assign Work
1. Select an inmate from the dropdown
2. Choose the work type
3. Enter supervisor name
4. Click "Assign Work"

### Manage Resources
1. Enter resource details
2. Click "Add Resource" to add new resources
3. Select a resource and click "Update Selected" to modify

### Medical Checkup
1. Select an inmate
2. Fill in checkup details (diagnosis, treatment, doctor)
3. Click "Save Checkup"

### Monitor Attendance
1. Select an inmate and their work assignment
2. Choose attendance status (Present/Absent/Late/Excused)
3. Click "Record Attendance"

### Incident Report
1. Select the inmate involved
2. Choose incident type
3. Describe the incident and action taken
4. Click "Save Report"

### Record Movement
1. Select an inmate
2. Enter from/to locations
3. Choose reason for movement
4. Click "Record Movement"

### Release Inmate
1. View eligible inmates (those whose release date has passed)
2. Select an inmate
3. Enter release notes and authorization
4. Click "Release Selected"

## Troubleshooting

### JavaFX Not Found
- Ensure JavaFX SDK is properly downloaded
- Verify the PATH_TO_FX in scripts points to the correct lib folder

### Compilation Errors
- Check Java version (must be 11 or higher)
- Ensure all source files are present

### Runtime Errors
- Check console for error messages
- Verify FXML files are in the correct location

## Future Enhancements

- Persistent database integration (SQLite/MySQL)
- User authentication and authorization
- Reporting and analytics features
- Export data to PDF/Excel
- Email notifications
- Visitor management module
- Educational program tracking
- Biometric integration

## Credits

Developed as part of Software Development and Analysis project.

## License

This project is for educational purposes.
