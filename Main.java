package com.company;

import java.util.*;


public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Random rnd = new Random();

        HashSet<String> qualifiers = new HashSet<String>();
        HashSet<String> hedges = new HashSet<String>();

        hedges.add("Please tell me more");
        hedges.add("Many of my patients tell me the same thing It is getting late");
        hedges.add("Maybe we better quit");
        hedges.add("I think we should go now");

        qualifiers.add("Why do you say that");
        qualifiers.add("You seem to think that");
        qualifiers.add("So you are concerned that");
        qualifiers.add("You meant to say that");
        qualifiers.add("Is that your thought that");

        int count=0;



        System.out.println("Welcome to a Therapy store, I am Eliza, How may I help you Today?");
        System.out.println("-----------------------------------------------------------------"+ count);
        System.out.println("Enter your Response here are or 'Q' to End the chat?");
        String s1 = sc.nextLine();
        String hedg;
        String qualif;
        String message = "";
        List<String> hedgesList = new ArrayList<>(hedges);
        List<String> qualifList = new ArrayList<>(qualifiers);
        String[] input = (s1.split(" "));


        while (!s1.toLowerCase().equals("q")) {
            input = (s1.split(" "));
            List<String> inptList = new ArrayList<>(Arrays.asList(input));
            int i1 = (rnd.nextInt(qualifiers.size()));
            qualif = qualifList.get(i1);
            int ind = rnd.nextInt(hedges.size());
            hedg = hedgesList.get(ind);
            if ((inptList.contains("I")) || (inptList.contains("my")) || (inptList.contains("me"))
                    || (inptList.contains("am")) || (inptList.contains("you"))) {
                for (int i = 0; i < input.length; i++) {
                    if (input[i].contains("I")) {
                        input[i] = input[i].replace("I", "you");
                    } else if (input[i].contains("me")) {
                        input[i] = input[i].replace("me", "you");
                    } else if (input[i].contains("my")) {
                        input[i] = input[i].replace("my", "your");
                    } else if (input[i].contains("am")) {
                        input[i] = input[i].replace("am", "are");
                    } else if (input[i].contains("you")) {
                        input[i] = input[i].replace("you", "me");

                    } else {
                        input[i] = input[i];
                    }

                    message += (input[i] + " ");
                }


                System.out.print(qualif + " " + message);

                System.out.print("?");
                count++;
                System.out.println("\n-----------------------------------------------------------------"+ count);
                System.out.println("Enter your Response here are or 'Q' to End the chat?");

                s1 = sc.nextLine();
                message="";
            } else {
                count++;
                System.out.println(hedg);
                System.out.println("\n-----------------------------------------------------------------"+ count);
                System.out.println("Enter your Response here are or 'Q' to End the chat?");
                s1 = sc.nextLine();
            }


        }
        System.out.println("\n-----------------------------------------------------------------");
        System.out.println("Thank you For chatting with us Today");
        System.out.println("You received " + count+ " Responses today");

    }
}

