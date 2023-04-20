public class exercise1 {

static boolean iwillBehave = true;
static boolean iwillGraduate = true;

    public static void main(String[] args) throws Exception {

        //precon
        assert iwillBehave == true: "[   bad dog, no treats for you :((   ]";

        //method
        College();

        //postcon
        assert iwillGraduate == true: "[   losers queue: new member detected!   ]";

    }

    static void College() {
        iwillGraduate = false;
        System.out.println("DIPLOMA O DIGNIDAD?");
    }
}
