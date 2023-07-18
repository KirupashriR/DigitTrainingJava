package com.digit.testProj.p1;
import java.util.Scanner;

class player {
   private String name;
   private int age;
   private String city;

   public void getName()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Name: ");
	   name=sc.nextLine();
   }
   public void getAge()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter Age: ");
	   age=sc.nextInt();
   }
   public void getCity()
   {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter City: ");
	   city=sc.nextLine();
   }
   public void setName(String name) {
       this.name = name;
   }

   public void setAge(int age) {
       this.age = age;
   }

   public void setCity(String city) {
       this.city = city;
   }
   public void displayName()
   {
	   System.out.print(name);
   }

   void displayDetails() {
       System.out.println("Candidate Details:");
       System.out.println("Name: " + name);
       System.out.println("Age: " + age);
       System.out.println("City: " + city);
   }
}

class Lifeline {
   String l[] = { "1. fiftyFifty", "2. audiencePoll" };
   boolean b[] = { true, true };
}

class Question {
   private String question;
   private String[] options;
   private int correctAnswer;
   private int amt;

   public Question(String question, String[] options, int correctAnswer, int amt) {
       this.question = question;
       this.options = options;
       this.correctAnswer = correctAnswer;
       this.amt = amt;
   }

   public String getQuestion() {
       return question;
   }

   public String[] getOptions() {
       return options;
   }

   public int getCorrectAnswer() {
       return correctAnswer;
   }

   public int getAmt() {
       return amt;
   }
}

class fiftyFifty extends Lifeline {
   String f50[] = {
           // Question 1
"1. You're 4th place right now in a race. What place will you be in when you pass the person in 3rd place?  \n   1.     2. 2nd    3. 3rd    4.    5. Lifeline",
// Question 2
"2. How many 0.5cm slices can you cut from a bread that is 25cm long?   \n   1. Fifty(50)    2.     3. Thrity Nine(39)    4.    5. Lifeline",
// Question 3
"3. There are two clocks of different colors: The green clock is broken and doesn't run at all, but the yellow clock loses one second every 24 hours. Which clock is more accurate?   \n   1. Green clock    2.     3. Neither     4.    5. Lineline",
// Question 4
"4. How many months have 28 days?  \n   1.    2.    3. All Of Them    4. Depends if there's a leap year or not    5.Lifeline",
// Question 5
"5. A farmer has 17 goats. All of them but 8 die. How many goats are alive?   \n   1. Eight(8)    2.     3. Twenty Five(25)    4.     5. Lifeline",
// Question 6
"6. If a leaf falls to the ground in a jungle, and no one hears it, will it make a sound?   \n   1. Yes    2.    3. Depends on how heavy the leaf was    4.   5. Lifeline",
// Question 7
"7. There are 45 mangoes in your basket. You take three out of the basket. How many mangoes are left?  \n   1.     2.     3. Fourty Five(45)    4. I do not eat Manngoes!    5. Lifeline",
// Question 8
"8. India’s official entry to Oscars 2021, ” Jallikattu” is, a film in which language? \n   1.    2.     3. Kannada     4. Malyalam    5. Lifeline",
// Question 9
"9. Divide 30 by half and add ten  \n   1.    2. 50    3. 70    4.   5. Lifeline",
// Question 10
"10. Jimmy's father has three sons- Paul I and Paul II. Can you guess the name of the third son?  \n   1.     2. Jerin    3. Jimmy    4.    5.Lifeline"
   };
}

class audiencePoll extends Lifeline {
   String p[] = {
           // Question 1
"1. You're 4th place right now in a race. What place will you be in when you pass the person in 3rd place?  \n   1. 1st----------5%    2. 2nd--------25%    3. 3rd------------65%    4. None of the above-------------5%    5. Lifeline",
// Question 2
"2. How many 0.5cm slices can you cut from a bread that is 25cm long?   \n   1. Fifty(50)-----------65%    2. Twenty Five(25)----------5%    3. Thrity Nine(39)------------25%    4. None of the above-----------5%    5. Lifeline",
// Question 3
"3. There are two clocks of different colors: The green clock is broken and doesn't run at all, but the yellow clock loses one second every 24 hours. Which clock is more accurate?   \n   1. Green clock-----------65%    2. Yellow Clock----------5%    3. Neither-----------25%     4. Both----------5%    5. Lineline",
// Question 4
"4. How many months have 28 days?  \n   1. Two(2)-----------5%    2. One(1)-----------5%    3. All Of Them----------65%    4. Depends if there's a leap year or not---------25%    5.Lifeline",
// Question 5
"5. A farmer has 17 goats. All of them but 8 die. How many goats are alive?   \n   1. Eight(8)--------------65%    2. Nine(9)------------5%    3. Twenty Five(25)-------------25%    4. Thirty Nine(39)----------------5%    5. Lifeline",
// Question 6
"6. If a leaf falls to the ground in a jungle, and no one hears it, will it make a sound?   \n   1. Yes-------65%    2. No---------5%    3. Depends on how heavy the leaf was-------25%    4. Depends on the place it landed--------------5%   5. Lifeline",
// Question 7
"7. There are 45 mangoes in your basket. You take three out of the basket. How many mangoes are left?  \n   1. Three(3)---------5%    2. Fourty Two(42)----------5%    3. Fourty Five(45)-----------65%    4. I do not eat Manngoes!----------25%    5. Lifeline",
// Question 8
"8. India’s official entry to Oscars 2021, ” Jallikattu” is, a film in which language?  \n   1.Hindi--------25%    2. Punjabi----------10%    3. Kannada----------5%    4. Malyalam--------------60%    5. Lifeline",
// Question 9
"9. Divide 30 by half and add ten  \n   1. 40.5-----------5%    2. 50----------25%    3. 70------------65%    4. None----------5%    5. Lifeline",
// Question 10
"10. Jimmy's father has three sons- Paul I and Paul II. Can you guess the name of the third son?  \n   1. Paul III------------5%    2. Jerin--------25%    3. Jimmy-----------65%    4. None--------5%    5.Lifeline"
};
}

class Life {
   Scanner sc = new Scanner(System.in);
   Lifeline li = new Lifeline();
   fiftyFifty f = new fiftyFifty();
   audiencePoll p = new audiencePoll();
   String cor;

   void lifeline(int i, Question[] questions) {
       int count = 0;

       System.out.println("Available lifelines:");

       for (int j = 0; j < 2; j++) {
           if (li.b[j]) {
               System.out.println(li.l[j]);
               count++;
           }
       }

       if (count > 0) {
           System.out.println("Select an available lifeline:");
           int l = sc.nextInt();

           if (li.b[l - 1] && l == 1) {
               System.out.println(f.f50[i]);
               li.b[l - 1] = false;
               String ans1 = sc.next();

               if (ans1.equals(Integer.toString(questions[i].getCorrectAnswer()))) {
                   cor = "correct";
                   System.out.println("Correct answer");
                   System.out.println("You won Rs." + questions[i].getAmt());
                   System.out.println();
               } else if (ans1.equals("5")) {
                   lifeline(i, questions);
               } else {
                   System.out.println("Wrong answer");
                   System.out.println("You won Rs." + (i == 0 ? 0 : questions[i - 1].getAmt()));
                   System.out.println();
                   System.exit(0);
               }
           } else if (li.b[l - 1] && l == 2) {
               System.out.println(p.p[i]);
               li.b[l - 1] = false;
               String ans1 = sc.next();

               if (ans1.equals(Integer.toString(questions[i].getCorrectAnswer()))) {
                   cor = "correct";
                   System.out.println("Correct answer");
                   System.out.println("You won Rs." + questions[i].getAmt());
                   System.out.println();
               } else if (ans1.equals("5")) {
                   lifeline(i, questions);
               } else {
                   System.out.println("Wrong answer");
                   System.out.println("You won Rs." + (i == 0 ? 0 : questions[i - 1].getAmt()));
                   System.out.println();
                   System.exit(0);
               }
           } else {
               System.out.println("Select a valid option");
               lifeline(i, questions);
           }
       } else {
           System.out.println("No lifelines available");
           String ans = sc.next();

           if (ans.equals(Integer.toString(questions[i].getCorrectAnswer()))) {
               cor = "correct";
               System.out.println("Correct answer");
               System.out.println("You won Rs." + questions[i].getAmt());
               System.out.println();
           } else {
               System.out.println("Wrong answer");
               System.out.println("You won Rs." + (i == 0 ? 0 : questions[i - 1].getAmt()));
               System.out.println();
               System.exit(0);
           }
       }
   }
}

public class kbc {
   public static void main(String[] args) {
       Scanner sc = new Scanner(System.in);
       player p=new player();
       Life lif = new Life();

       System.out.println("****** WELCOME TO KAUN BANEGA CROREPATI ******");

       p.getName();
       p.getAge();
       p.getCity();

       System.out.println();
       p.displayDetails();
       System.out.println();

       Question[] questions = {
           new Question("Question 1\nYou're 4th place right now in a race. What place will you be in when you pass the person in 3rd place?",
                   new String[]{"1.1st", "2.2nd", "3.3rd", "4.None of the above", "5.Lifeline"}, 3, 10000),

           new Question("\nQuestion 2\nHow many 0.5cm slices can you cut from a bread that is 25cm long?",
                   new String[]{"1.Fifty(50)","2.Twenty Five(25)","3.Thrity Nine(39)","4.None of the above","5.Lifeline"},1,20000),

           new Question("\nQuestion 3\nThere are two clocks of different colors: The green clock is broken and doesn't run at all, but the yellow clock loses one second every 24 hours. Which clock is more accurate? ",
                   new String[]{"1.Green clock","2.Yellow Clock","3.Neither","4.Both","5.Lineline"},1,30000),

       new Question("\nQuestion 4\nHow many months have 28 days? ",
               new String[]{"1.Two(2)","2.One(1)","3.All Of Them","4.Depends if there's a leap year or not","5.Lifeline"},3,40000),

       new Question("\nQuestion 5\nA farmer has 17 goats. All of them but 8 die. How many goats are alive? ",
               new String[]{"1.Eight(8)","2.Nine(9)","3,Twenty Five(25)","4.Thirty Nine(39)","5.Lifeline"},1,50000),

       new Question("\nQuestion 6\nIf a leaf falls to the ground in a jungle, and no one hears it, will it make a sound? ",
               new String[]{"1.Yes","2.No","3.Depends on how heavy the leaf was","4.Depends on the place it landed","5.Lifeline"},1,200000),

       new Question("\nQuestion 7\nThere are 45 mangoes in your basket. You take three out of the basket. How many mangoes are left? ",
               new String[]{"1.Three(3)","2.Fourty Two(42)","3.Fourty Five(45)","4.I do not eat Manngoes!","5.Lifeline"},3,400000),

       new Question("\nQuestion 8\nIndia’s official entry to Oscars 2021, ” Jallikattu” is, a film in which language? ",
               new String[]{"1.Hindi","2.Punjabi","3.Kannada","4.Malayalam","5.Lifeline"},4,600000),

       new Question("\nQuestion 9\nDivide 30 by half and add ten? ",
               new String[]{"1.40.5","2.50","3.70","4.None","5.Lineline"},3,800000),

       new Question("\nQuestion 10\nJimmy's father has three sons- Paul I and Paul II. Can you guess the name of the third son? ",
               new String[]{"1.Paul III","2.Jerin","3.Jimmy","4.None","5.Lineline"},3,1000000)
       };

       String cor = "correct";

       for (int i = 0; i < questions.length; i++) 
       {
           if (cor.equals("correct"))
           {
               System.out.println(questions[i].getQuestion());
               String[] options = questions[i].getOptions();
               for (int j = 0; j < options.length; j++) 
               {
                   System.out.println(options[j]);
               }
           }

           String ans = sc.next();

           if (ans.equals(Integer.toString(questions[i].getCorrectAnswer()))) {
               cor = "correct";
               System.out.println("Correct answer");
               System.out.println("You won Rs." + questions[i].getAmt());
           } else if (ans.equals("5")) 
           {
               lif.lifeline(i, questions);
           } 
           else
           {
               System.out.println("Wrong answer");
               System.out.println("You won Rs." + (i == 0 ? 0 : questions[i - 1].getAmt()));
               p.displayName();
               System.out.println(" is leaving with Rs"+questions[i-1].getAmt());
               break;
           }

           if (i == questions.length - 1) {
               System.out.println("Congrats!!.... You are the winner.");
           }
       }

       sc.close();	
   }
}
