package day41_CustomClass_Constructor.ScrumTask;

public class TesterObject_BankOfAmerica {

    public static void main(String[] args) {

        Tester tester1 = new Tester("Zack", 'M', "QA", 100000, 1);
        Tester tester2 = new Tester("Tom", 'M', "SM", 120000, 2);
        Tester tester3 = new Tester("Inna", 'F', "SDET", 150000, 3);

        Tester[] testers ={tester2, tester3};

        Developer developer1 = new Developer("Jason", 'M', "Software Developer", 11, 120000);
        Developer developer2 = new Developer("Rita", 'F', "Java Developer", 12, 115000);
        Developer developer3 = new Developer("Muhtar", 'M', "Developer", 13, 130000);
        Developer developer4 = new Developer("Diana", 'M', "Java Developer", 14, 140000);

        Developer[] developers = {developer2, developer3, developer4};

       ScrumTeam scrum1 = new ScrumTeam("Jack Smith", "Aysu Ahmadil", "Inesa Yun");
       scrum1.hireTester(tester1);
       scrum1.hireDeveloper(developer1);
       scrum1.hireTester(testers);
       scrum1.hireDeveloper(developers);

       scrum1.hireTester(new Tester("Tugba", 'F', "SDET", 9, 118000));

        System.out.println(scrum1);

       double budget = 0;
       double totalBudget = 0;

       for( Tester eachTester : scrum1.testers){
           budget+=eachTester.salary;
       }

       for (Developer eachDeveloper : scrum1.developers){
           budget+= eachDeveloper.salary;
       }

       System.out.println("budget = " + budget);

       ScrumTeam scrum2 = new ScrumTeam("", "", ""); // add 5 testers and 6 developers

       Tester tester4 = new Tester("A", 'M', "QA", 100000, 4);
       Tester tester5 = new Tester("B", 'M', "QA", 100000, 5);
       Tester tester6 = new Tester("C", 'M', "QA", 100000, 6);
       Tester tester7 = new Tester("D", 'M', "QA", 100000, 7);
       Tester tester8 = new Tester("E", 'M', "QA", 100000, 7);

       Tester[] testers1 ={tester4, tester5, tester6, tester7, tester8}; // add 5 testers

        Developer developer5 = new Developer("F", 'M', "Software Developer", 9, 120000);
        Developer developer6 = new Developer("G", 'F', "Java Developer", 10, 115000);
        Developer developer7 = new Developer("H", 'M', "Developer", 11, 130000);
        Developer developer8 = new Developer("I", 'M', "Java Developer", 12, 140000);
        Developer developer9 = new Developer("J", 'M', "Java Developer", 12, 140000);
        Developer developer10 = new Developer("K", 'M', "Java Developer", 12, 140000);

        Developer[] developers1 = {developer5, developer6, developer7, developer8, developer9, developer10}; // add 6 developers

        ScrumTeam scrum3 = new ScrumTeam("", "", ""); // add 2 testers and 4 developers
        Tester tester9 = new Tester("L", 'M', "QA", 100000, 13);
        Tester tester10 = new Tester("M", 'M', "QA", 100000, 14);

        Tester[] testers2 ={tester9, tester10}; // add 2 testers

        Developer developer11 = new Developer("N", 'M', "Developer", 11, 130000);
        Developer developer12 = new Developer("O", 'M', "Developer", 11, 130000);
        Developer developer13 = new Developer("P", 'M', "Developer", 11, 130000);
        Developer developer14 = new Developer("Q", 'M', "Developer", 11, 130000);

        Developer[] developers2 = {developer11, developer12, developer13, developer14};

        ScrumTeam[] scrumTeams = {scrum1, scrum2, scrum3};

        //ScrumTeam scrum2 = new ScrumTeam("Jack Smith", "Aysu Ahmadil", "Inesa Yun");

        scrum2.hireTester(tester2);
        scrum2.hireDeveloper(developer1);
        scrum2.hireTester(testers);
        scrum2.hireDeveloper(developers);

        scrum1.hireTester(new Tester("Tugba", 'F', "SDET", 9, 118000));

       // ScrumTeam scrum3 = new ScrumTeam("John", "Helen", "Rita");




        /*
        for (ScrumTeam eachScrum : scrumTeams) {
            for (Tester tester : eachScrum.testers) {
            }
            for (Developer developer : eachScrum.developers) {
            }
        }
        1. total budget
        2. total Number of testers in Bank of America
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the tester
        5. what's the max & min salaries of the developer
        */

    }

}
