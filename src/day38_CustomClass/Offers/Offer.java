package day38_CustomClass.Offers;

public class Offer {

    public String state, city, jobTitle;
    public double salary;
    public boolean hasBenefits, isWFH, hasPTO, isFullTime;

    public void setInfo(String state, String city, String jobTitle, double salary, boolean hasBenefits, boolean isWFH, boolean hasPTO, boolean isFullTime) {
        this.state = state;
        this.city = city;
        this.jobTitle = jobTitle;
        this.salary = salary;
        this.hasBenefits = hasBenefits;
        this.isWFH = isWFH;
        this.hasPTO = hasPTO;
        this.isFullTime = isFullTime;
    }

    public String toString() {
        return "Offer{" +
                "state='" + state + '\'' +
                ", city='" + city + '\'' +
                ", jobTitle='" + jobTitle + '\'' +
                ", salary=" + salary +
                ", hasBenefits=" + hasBenefits +
                ", isWFH=" + isWFH +
                ", hasPTO=" + hasPTO +
                '}';
    }
}
/*
    Offer:
	    Attributes:
	        state, city, hasBenefit(boolean), salary, WFH(boolean), JobTitle

	    Actions:
	        SetInfo, toString

	    create a class named MyOffers
	        1. create 7 objects Offer Class and store them into an arraylist
	        2. write a program that can only keep the offers from your local area
	        3. write program that can remove all the offers that are not SDET or QA
	        4. write a program that can remove all the offers that are not WFH
	        5. write a program that can remove all the offers that do not have benefits

 */