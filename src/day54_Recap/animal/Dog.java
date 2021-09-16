package day54_Recap.animal;

public class Dog extends Animal{

    private String breed;
    private int humanYears;

    public Dog(String name, int age){
        super(name, age);
        this.breed=breed;
    }

    @Override
    public int getAgeInHumanYears() {
        if (getAge() <= 2) {
            return humanYears = getAge() * 11;
        } else {
            return humanYears = 22 + ((getAge() - 2) * 5);
        }
    }

        @Override
        public boolean equals(Object obj){
            if(obj.equals(getName())){
                System.exit(0);
            }
                return false;
            }


        @Override
        public String toString(){
            return "Name: "+getName()+'\n'+
                    "Breed: "+breed+'\n'+
                    "Age in calendar years: "+getAge()+'\n'+
                    "Age in calendar years: "+getAgeInHumanYears();
        }

    }




