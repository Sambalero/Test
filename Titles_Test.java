
package mypackage;



import org.openqa.selenium.WebDriver;

import org.openqa.selenium.firefox.FirefoxDriver;



public class myclass {



    public static void main(String[] args) {

        // declaration and instantiation of objects/variables
        
        int tests = 0;
        int passed = 0;
        int failed = 0;

        WebDriver driver = new FirefoxDriver();

        String[] urlsNtitles = new String[] {"http://everyonecandance.eu.pn/",  "Everyone Can Dance",  "http://everyonecandance.eu.pn/Why.php",  "Why Dance?",  "http://everyonecandance.eu.pn/History.php",  "The History of this Class",  "http://everyonecandance.eu.pn/Theory.php",  "Dance Theory",  "http://everyonecandance.eu.pn/Beat.php",  "The Beat",  "http://everyonecandance.eu.pn/Move.php",  "Body Lead",  "http://everyonecandance.eu.pn/Special.php",  "Dance Stories",  "http://everyonecandance.eu.pn/Faq.php",  "FAQs",  "http://everyonecandance.eu.pn/Resources.php",  "Dance Resources",  "http://everyonecandance.eu.pn/Credit.php",  "Credits",  "http://everyonecandance.eu.pn/Flier.php",  "Everyone Can Dance Fliers", "https://github.com/Sambalero/newbies", "Sambalero/newbies ? GitHub", "https://stark-water-6971.herokuapp.com/", "Ruby on Rails Tutorial Sample App", "https://noobs.herokuapp.com/", "Newbies!", "https://noobs.herokuapp.com/visitors/welcome", "Newbies! The Newbies! Story", "http://message.co.nf/", "Message from the Dead", "http://kevinswallow.weebly.com/index.html", "Kevin Swallow - Home", "http://kevinswallow.com/", "Junior Front End Web Developer", "http://kevinswallow.blg.lt/Blog/", "Kevin's JS Jive | Figgerin It Out"};

        for(int i = 0; i < urlsNtitles.length; i+=2){

            String baseUrl = urlsNtitles[i];

            String expectedTitle = urlsNtitles[i+1];

            String actualTitle = "";

            tests++;

            // launch Firefox and direct it to the Base URL

            driver.get(baseUrl);



            // get the actual value of the title

            actualTitle = driver.getTitle();



            /*

             * compare the actual title of the page with the expected one and print

             * the result as "Passed" or "Failed"

             */
            
            System.out.println("Base Url = " + baseUrl);
            System.out.println("Expected Title = " + expectedTitle);
            System.out.println("Actual Title = " + actualTitle);

            if (actualTitle.contentEquals(expectedTitle)){

                System.out.println("Test Passed!");
                passed++;

            } else {

                System.out.println("Test Failed");
                System.out.println("**************************");
                failed++;

            }

        }    
        // Report
        
        System.out.println("**************************");
        System.out.println("Tests: " + tests);
        System.out.println("Passed: " + passed);
        System.out.println("Failed: " + failed);
        System.out.println("**************************");

        //close Firefox

        driver.close();

       

        // exit the program explicitly

        System.exit(0);

    }



}

