import java.util.Scanner;

public class IdentityCardInformation{
    public static void main(String [] args){
        String CNIC, province, gender,
                division = "The card holder doesn't belong to division Gujranwala.";
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter CNIC Number: ");
        CNIC = sc.next();
        if(CNIC.length() == 13){
            if(CNIC.charAt(0) == '1'){
                province = "Khyber Pakhthunkhwa";
            }else if(CNIC.charAt(0) == '2'){
                province = "Federally Administered Tribal Areas (FATA)";
            }else if(CNIC.charAt(0) == '3'){
                province = "Pubjab";
                if(CNIC.charAt(1) == '4'){
                    division = "The card holder belongs to division Gujranwala.";
                }
            }else if(CNIC.charAt(0) == '4'){
                province = "Sindh";
            }else if(CNIC.charAt(0) == '5'){
                province = "Balochistan";
            }else if(CNIC.charAt(0) == '6'){
                province = "Islamabad Capital Territory";
            }else if(CNIC.charAt(0) == '7'){
                province = "Gilgit-Balistan";
            }else{
                System.out.println("Invalid CNIC number.");
                return;
            }
            if(CNIC.charAt(12) % 2 == 0){
                gender = "Female";
            }else{
                gender = "Male";
            }
            System.out.println("The card holder is from province: "+ province +  ".");
            System.out.println(division);
            System.out.println("The gender of card holder is "+ gender +  ".");
        }else{
            System.out.println("Invalid CNIC number.");
        }
    }
}