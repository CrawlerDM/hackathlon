import Program.Repo;

import java.util.Base64;
import java.nio.charset.StandardCharsets;

public class Main {


    public static void main(String[] args) {
        Repo repo = new Repo();
        //System.out.println(repo.getCeases().result().bodyAsString());
        System.out.println(repo.getPictureUrl());

        // opdracht 13ccaf43-9454-4b49-bea8-85696a01e285
        //  
        System.out.println("String to Hex: " + StringToHex("WgARKpgTJxG"));
        System.out.println("Decode: " + Decode("MkhscEJuVjMyMERYZm9jaWNSbQ=="));
        System.out.println("Reverse: " + reverse("iZlYzSo8xOGkuhf9LRlJ8kQulRG2uNJRazhc1QLxwlUEwhhgCXB7fMNEls6Hx4Ksy43eCr0QtAMvm79jEnJxVfWEKkpLdtnKAXY6S922yu8n"));



    }



    public String BruteForce(){
        /*
         {
            "id": "87b06872-0d0a-43c9-b462-7a2a7b3def37",
            "investigation": "Brute force the password. It can contain upper/lowercase alphanumeric characters",
            "investigationParameters": "",
            "attemptsRemaining": "Unlimited",
            "outcome": null
          }
        */
        return null;
    };

    public static String StringToHex(String string){

        String out = new String();
        for( int i = 0; i < string.length(); i++){
            
            
            out += Integer.toHexString((int) string.charAt(i)) + " ";
            

        }
        return out.trim();
        /*
        {
            "id": "13ccaf43-9454-4b49-bea8-85696a01e285",
            "investigation": "Convert the following String to hexadecimal value (Use a space delimiter between values)",
            "investigationParameters": "WgARKpgTJxG",
            "attemptsRemaining": "1",
            "outcome": null
          }
        */
    }


    public static String Decode(String string){
        /*
        {
            "id": "9c803f8a-140d-4a67-a34e-6b6ebbdf3d95",
            "investigation": "Decode the following String. It uses a quite common encoding, find out which!",
            "investigationParameters": "MkhscEJuVjMyMERYZm9jaWNSbQ==",
            "attemptsRemaining": "10",
            "outcome": null
          }
        */
        return new String(Base64.getDecoder().decode(string), StandardCharsets.UTF_8);
    }

/*

    {
        "caseId": "91bc45fa-5612-4e49-bcc4-97306ed05d0a",
        "investigations": [
         ,
          ,
          ,
          {
            "id": "0a8e88b8-7e58-4184-aed9-6e709d1c6e7a",
            "investigation": "What is the Perfect Number in the nth position (1-based)?",
            "investigationParameters": "{\"nth element\":\"3\"}",
            "attemptsRemaining": "1",
            "outcome": null
          },
          */

    public static  String reverse(String string) {

        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
    /*
          {
            "id": "fe936f1e-e538-4e6d-bfa0-18f7e372495b",
            "investigation": "Reverse the following String",
            "investigationParameters": "iZlYzSo8xOGkuhf9LRlJ8kQulRG2uNJRazhc1QLxwlUEwhhgCXB7fMNEls6Hx4Ksy43eCr0QtAMvm79jEnJxVfWEKkpLdtnKAXY6S922yu8n",
            "attemptsRemaining": "1",
            "outcome": null
          },

*/
    public static  String returnIndexHashMap(String string) {
         string = "{\"index\":\"3\",\"hashmap\":\"{1=9wN, 2=pTxG, 3=VqM, 4=Jb6, 5=eFA}\"}";
        StringBuilder sb = new StringBuilder(string);
        sb.reverse();
        return sb.toString();
    }
    /*


          {
            "id": "8d1c499f-78e8-457e-b7e7-f54baacb1fe9",
            "investigation": "Return element at index of the given hashmap",
            "investigationParameters": "{\"index\":\"3\",\"hashmap\":\"{1=9wN, 2=pTxG, 3=VqM, 4=Jb6, 5=eFA}\"}",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "070a2078-7672-495a-9624-5b962232fa9e",
            "investigation": "Replace string at given index in arraylist",
            "investigationParameters": "{\"index\":\"7\",\"arrayList\":\"[wwJY, ggH, zPE, wpAP, 3wdh, 2gK, lAO, q83, Crc, qng]\",\"replacement\":\"Dfl\"}",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "4b2d80ba-89a8-45f4-9814-145b95607763",
            "investigation": "Find the missing numbers in the sequence. Return them as a comma-separated string",
            "investigationParameters": "[0,1,2,3,13,21,34,55,89,144,233,377,610,987,2584,4181,0,1,1,3,8,13,21,34,55,144,377,610,987,1597,2584,4181,0,2,5,8,13,21,34,55,89,144,233,377,610,1597,4181,0,1,2,3,5,8,13,21,34,89,233,377,610,987,1597,4181,0,1,1,3,8,13,21,34,55,89,144,987,1597,2584,4181,0,1,2,3,5,8,13,21,34,55,89,144,233,377,610,987,4181,1,1,3,5,8,13,21,34,55,89,233,377,610,987,2584,4181,0,1,1,2,3,5,13,21,34,89,144,233,377,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,233,377,610,2584,4181,0,1,1,2,5,8,21,34,89,144,233,377,987,1597,2584,4181,0,1,1,3,5,13,21,55,89,144,610,987,1597,2584,4181,0,1,1,2,3,8,13,55,89,233,377,610,1597,2584,4181,0,1,1,2,3,5,13,21,34,55,89,610,987,1597,2584,4181,0,1,1,3,5,8,21,55,89,144,233,377,610,2584,4181,0,1,2,3,8,13,55,89,233,377,610,987,1597,2584,4181,0,1,2,3,5,13,21,55,89,144,233,377,987,1597,2584,4181,1,2,3,8,13,21,34,55,89,144,233,610,987,1597,2584,4181,0,1,2,5,13,21,34,55,144,233,377,610,987,1597,2584,4181,0,1,1,2,8,13,21,34,89,144,233,610,987,2584,4181,0,1,2,3,5,8,13,34,55,89,144,610,987,1597,2584,4181,0,1,1,2,5,8,13,21,34,55,89,144,377,987,1597,2584,4181,0,1,2,3,5,8,21,89,144,233,377,610,987,1597,4181,0,1,1,2,5,8,13,21,34,89,233,377,987,1597,2584,4181,0,1,2,5,8,13,21,34,55,144,377,610,987,1597,2584,4181,0,1,2,5,8,13,34,55,89,144,233,610,987,1597,2584,4181,0,1,2,3,5,8,13,21,34,55,89,144,233,987,2584,4181,0,1,1,2,3,5,8,13,55,89,144,377,610,2584,4181,0,1,2,3,5,8,13,34,55,144,233,377,610,1597,2584,4181,0,1,1,5,8,13,21,55,89,144,233,377,610,1597,4181,1,1,2,3,5,8,13,21,34,55,89,233,377,987,1597,2584,4181,0,1,1,2,3,5,8,13,21,34,89,233,377,987,2584,4181,0,1,1,2,5,13,21,34,55,144,233,610,987,1597,2584,4181,0,1,2,3,8,13,21,34,55,89,144,233,377,987,2584,4181,1,1,5,8,13,21,34,89,233,377,610,987,1597,2584,4181,0,2,3,8,13,21,34,55,89,144,377,610,987,1597,4181]",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "e3a82c9f-781c-4ac0-afd1-41e20abe79b9",
            "investigation": "Is the following string in alphabetical order? (Use N or Y as answer)",
            "investigationParameters": "QXAFAyCNLGs2kjgYm9RNrbItyyjMtJhdkiwWQepGgcxegiBvxNfIQGhm99OLCiiuNIhq0QxSZVnxomUYx7vFmAcMJbowXJPwKBjboS8sSpd4D76KQg6DefBFrsrEObz9NvE8nztKIvwIiRLA",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "af697327-f06f-4dc4-8194-6943cc951c36",
            "investigation": "Answer is the first and last day of the month (MONDAY - SUNDAY) eg: MONDAY-FRIDAY",
            "investigationParameters": "{\"month\":\"2\",\"year\":\"2019\"}",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "0a945b92-2eea-4649-ac27-56305c43d5f9",
            "investigation": "Decode the following string",
            "investigationParameters": ".-- ..-. .--. -.-. .... -. ... -.-- -- - -- ..",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "85511f17-955c-4c18-87fb-ef071e2419d7",
            "investigation": "Find all the primes between the start and end index (both inclusive)",
            "investigationParameters": "{\"start\":57355,\"end\":57455}",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "1ebd3070-b8cb-4410-9d5f-a9d0b2eea7f7",
            "investigation": "Is the following number a Disarium Number? (Use N or Y as answer)",
            "investigationParameters": "171",
            "attemptsRemaining": "1",
            "outcome": null
          },
          {
            "id": "d9189514-592a-4cf8-a802-b51a0a1718a2",
            "investigation": "The following string is encrypted with an ancient algorithm, invented in one of the mightiest empires of all time.Tip: one of the leaders of this empire.",
            "investigationParameters": "acyngjbpxbiqfc",
            "attemptsRemaining": "Unlimited",
            "outcome": null

            */

}



