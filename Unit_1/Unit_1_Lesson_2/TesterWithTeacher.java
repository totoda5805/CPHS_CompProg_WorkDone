package Unit_1_Lesson_2;

public class TesterWithTeacher {

    public static void main(String[] args) {
        
        //Concentrate on how it works:
        String s = "The number of rabbits is";
        int argh = 129;
        String report = s + " " + argh + ".";
        System.out.println(report);
        
        //toUpperCase Method:
        String p = "Groovy Dude";
        System.out.println(p.toUpperCase());
        
        //toLowerCase Method:
        String g = "Computer Science is for nerds";
        System.out.println(g.toLowerCase());
        
        //substring Method (Starts at zero):
        String c;
        String m = "The Gettysburg Address";
        c = m.substring(4);
        System.out.println(c);
            //Second param for substring:
        String b = "Four score and seven years ago,";
        c = b.substring(7, 12);
        System.out.println(c);
        
        //length Method:
        int count;
        String s2 = "Surface tension";
        count = s2.length();
        System.out.println(count);
        
        //Force or Escape : ( "\"" )
        String s3 = "Look here!";
        System.out.println("\"" + s3 + "\"" + " has " + s3.length() + " characters.");
    }
    
}


