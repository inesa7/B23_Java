package day42_CustomClass_Constructor.capitalOneTask;

import day41_CustomClass_Constructor.ScrumTask.Developer;
import day41_CustomClass_Constructor.ScrumTask.ScrumTeam;
import day41_CustomClass_Constructor.ScrumTask.Tester;

public class CapitalOne {

        public static void main(String[] args) {
            ScrumTeam scrumTeam1 = new ScrumTeam("Zengin", "Engin", "Cengiz");
            scrumTeam1.hireTester(HumanResource.testersTeam1);
            scrumTeam1.hireDeveloper(HumanResource.devopsTeam1);

            ScrumTeam scrumTeam2 = new ScrumTeam("Selda", "Mucahit", "Dilem");
            scrumTeam2.hireTester(HumanResource.testersTeam2);
            scrumTeam2.hireDeveloper(HumanResource.devopsTeam2);

            ScrumTeam scrumTeam3 =new ScrumTeam("Mohigul","Maftuna","Zulkhumor");
            scrumTeam3.hireTester(HumanResource.testersTeam3);
            scrumTeam3.hireDeveloper(HumanResource.devopsTeam3);

            System.out.println(scrumTeam1);
            System.out.println(scrumTeam2);
            System.out.println(scrumTeam3);

            System.out.println("----------------------------------------");

            ScrumTeam[] scrums = {scrumTeam1, scrumTeam2, scrumTeam3};

            //1. find total budget

            double budget = 0;
            for( ScrumTeam eachScrumTeam : scrums){ // outer loop for iterating each scrum team

                for( Tester eachTester : eachScrumTeam.testers){ // inner loop to iterate each tester from scrum team
                    budget+=eachTester.salary;
                }
                for(Developer eachDeveloper : eachScrumTeam.developers){ // inner loop to iterate each developer from scrum team
                    budget+=eachDeveloper.salary;
                }
            }

            // 2. find total Number of testers in CapitalOne
            // 3. total number of developers in Bank of America

            int totalNumberOfTesters=0;
            int totalNumberOfDevelopers=0;

            for(ScrumTeam eachScrumTeam : scrums){
                totalNumberOfTesters+=eachScrumTeam.testers.size();
               totalNumberOfDevelopers+=eachScrumTeam.developers.size();
            }

            System.out.println("totalNumberOfTesters = " + totalNumberOfTesters);
            System.out.println("totalNumberOfDevelopers = " + totalNumberOfDevelopers);

            //4. what's the max & min salaries of the testers

            double maxSalaryOfTester=0; // scrums[0].testers.get(0).salary;
            double minSalaryOfTester=Double.MAX_VALUE;

            double maxSalaryOfDevepoler=0; // scrums[0].developers.get(0).salary;
            double minSalaryOfDeveloper=Double.MAX_VALUE;
            String t1="", t2="", d1="", d2="";


            for (ScrumTeam eachScrum : scrums) {
                for (Tester eachTester : eachScrum.testers) {

                    for(Developer eachDeveloper : eachScrum.developers){ // iterates each developer
                        if(eachDeveloper.salary>maxSalaryOfDevepoler){
                            maxSalaryOfDevepoler=eachDeveloper.salary;
                            d1=eachDeveloper.name;
                        }

                        if(eachDeveloper.salary<minSalaryOfDeveloper){
                            minSalaryOfDeveloper=eachDeveloper.salary;
                            d2=eachDeveloper.name;
                        }

                    }

                    /*
                    using Math() method:

                    maxSalaryOfTester=Math.max(eachTester.salary, maxSalaryOfTester);
                    minSalaryOfTester=Math.
                     */


                    //using if statement
                    if(eachTester.salary>maxSalaryOfTester){
                        maxSalaryOfTester=eachTester.salary;
                    }

                    if(eachTester.salary<minSalaryOfTester){
                        minSalaryOfTester=eachTester.salary;
                    }

                    System.out.println("minSalaryOfTester = " + minSalaryOfTester);
                    System.out.println("maxSalaryOfTester = " + maxSalaryOfTester);

                    System.out.println("minSalaryOfDeveloper = " + minSalaryOfDeveloper);
                    System.out.println("maxSalaryOfDevepoler = " + maxSalaryOfDevepoler);

                }
            }






        }

    }

/*
        1. total budget
        2. total Number of testers in CapitalOne
        3. total number of developers in Bank of America
        4. what's the max & min salaries of the testers
        5. what's the max & min salaries of the developers
 */


