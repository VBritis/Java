import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Gerenciador g1 = new Gerenciador(0, 0, 0);
        Scanner sc = new Scanner(System.in);

        System.out.println("             =================================================");
        System.out.println("                         PROJECT MANAGEMENT SYSTEM");
        System.out.println("             =================================================");
        Smile();
        System.out.println("+-------------------------------------------------+");
        System.out.print("Please enter the current day: ");
        int day = sc.nextInt();
        System.out.print("Please enter the current month: ");
        int month = sc.nextInt();
        System.out.print("Please enter the current year: ");
        int year = sc.nextInt();
        sc.nextLine(); // Consuming the newline character left after nextInt()
        g1.setData(day, month, year);

        boolean loop = true;
        while (loop) {
            displayOptions();
            int choice = sc.nextInt();
            sc.nextLine(); // Consuming the newline character left after nextInt()

            Projeto currentProject = null;

            if (choice == 1) {
                System.out.println("Create new project:");
                System.out.print("Enter the project name: ");
                String projectName = sc.nextLine();
                System.out.print("Enter the project duration in days: ");
                int duration = sc.nextInt();
                sc.nextLine(); // Consuming the newline character left after nextInt()

                currentProject = new Projeto(projectName, duration, g1);
                g1.addProjeto(currentProject);

                System.out.println("Project created successfully!");
            } else if (choice == 2) {
                System.out.print("Enter the project name: ");
                String projectName = sc.nextLine();
                currentProject = g1.getProjeto(projectName);

                if (currentProject != null) {
                    System.out.println("Project found: ");
                    System.out.println(currentProject.toString());
                } else {
                    System.out.println("Project not found.");
                }
            } else if (choice == 3) {
                System.out.print("Enter the project name to alter: ");
                String projectName = sc.nextLine();
                currentProject = g1.getProjeto(projectName);

                if (currentProject != null) {
                    System.out.println("Project selected: ");
                    System.out.println(currentProject.toString());
                } else {
                    System.out.println("Project not found.");
                    continue;
                }
            } else if (choice == 4) {
                loop = false;
                break;
            } else {
                System.out.println("Invalid option.");
                continue;
            }

            if (choice == 1 || choice == 3) {
                boolean continuar = true;
                while (continuar) {
                    displayActionOptions();
                    int actionChoice = sc.nextInt();
                    sc.nextLine(); // Consuming the newline character left after nextInt()

                    if (actionChoice == 1) {
                        System.out.println("Add new member:");
                        System.out.print("Enter member name: ");
                        String memberName = sc.nextLine();
                        System.out.print("Enter member ID: ");
                        int memberId = sc.nextInt();
                        sc.nextLine(); // Consuming the newline character left after nextInt()
                        System.out.print("Enter member role: ");
                        String memberRole = sc.nextLine();

                        Membro newMember = new Membro(memberName, memberId, null, memberRole);
                        currentProject.addMembro(newMember);

                        System.out.println("Member added successfully!");
                    } else if (actionChoice == 2) {
                        System.out.println("Add new task:");
                        System.out.print("Enter task title: ");
                        String taskTitle = sc.nextLine();
                        System.out.print("Enter task description: ");
                        String taskDescription = sc.nextLine();
                        System.out.print("Enter member name assigned to the task: ");
                        String taskMemberName = sc.nextLine();
                        System.out.print("Enter task duration in days: ");
                        int taskDuration = sc.nextInt();
                        System.out.print("Enter task progress (in percentage): ");
                        int taskProgress = sc.nextInt();
                        sc.nextLine(); // Consuming the newline character left after nextInt()

                        Membro assignedMember = currentProject.getMembro(taskMemberName);
                        Tarefa newTask = new Tarefa(taskTitle, taskDescription, assignedMember, taskDuration, taskProgress, currentProject, g1);
                        currentProject.addTarefa(newTask);

                        System.out.println("Task added successfully!");
                    } else if (actionChoice == 3) {
                        System.out.println("Add new meeting:");
                        System.out.print("Enter meeting day: ");
                        int meetingDay = sc.nextInt();
                        System.out.print("Enter meeting month: ");
                        int meetingMonth = sc.nextInt();
                        System.out.print("Enter meeting year: ");
                        int meetingYear = sc.nextInt();
                        sc.nextLine(); // Consuming the newline character left after nextInt()
                        System.out.print("Enter meeting description: ");
                        String meetingDescription = sc.nextLine();

                        Reuniao newMeeting = new Reuniao(meetingDay, meetingMonth, meetingYear, meetingDescription, currentProject);
                        System.out.println("Enter member names (enter 'done' to finish): ");
                        while (true) {
                            String memberName = sc.nextLine();
                            if (memberName.equalsIgnoreCase("done")) {
                                break;
                            }
                            Membro member = currentProject.getMembro(memberName);
                            if (member != null) {
                                newMeeting.addParticipante(member);
                            } else {
                                System.out.println("Member not found.");
                            }
                        }
                        currentProject.addReuniao(newMeeting);

                        System.out.println("Meeting added successfully!");
                    } else if (actionChoice == 4) {
                        System.out.println("Project details:");
                        System.out.println(currentProject.toString());
                        continuar = false;
                    } else if (actionChoice == 5) {
                        System.out.println("Task name:");
                        String taskName = sc.nextLine();
                        System.out.println("New Status:");
                        int taskStatus = sc.nextInt();
                        g1.getTarefa(taskName).setStatus(taskStatus);
                    } else {
                        System.out.println("Invalid option.");
                    }
                }
            }

            System.out.println("=================================================");
            System.out.println("Final project details:");
            if (currentProject != null) {
                System.out.println(currentProject.toString());
            } else {
                System.out.println("No project to display.");
            }
        }
        sc.close();
    }

    private static void displayOptions() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To create a new project:              1         |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To search for an already created project: 2     |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To alter one project:                3          |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To finish program:                   4          |");
        System.out.println("+-------------------------------------------------+");
    }

    private static void displayActionOptions() {
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To add members:                      1          |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To add tasks:                        2          |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To add meetings:                     3          |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To finish:                           4          |");
        System.out.println("+-------------------------------------------------+");
        System.out.println("| To update a task:                    5          |");
        System.out.println("+-------------------------------------------------+");
    }
    public static String Smile() {
        StringBuilder monitor = new StringBuilder();
        
        // Top of the monitor
        monitor.append("  +------------------+\n");
        
        // Screen with smile
        monitor.append("  |                  |\n");
        monitor.append("  |                  |    /\n");
        monitor.append("  |      |   |       |   /\n");
        monitor.append("  |                  |  /\n");
        monitor.append("  |      \\___/       | /\n");
        monitor.append("  |                  |/\n");
        monitor.append("  |                  |\n");
        
        // Bottom of the monitor
        monitor.append("  +------------------+\n");
        
        // Monitor stand
        monitor.append("          ||      \n");
        monitor.append("          ||      \n");
        monitor.append("        /----\\   \n");
        monitor.append("       /      \\  \n");
        
        System.out.print(monitor.toString());
        return monitor.toString();
    }

    
}


