package talrise.pages;


import talrise.utilities.Driver;

public class PageInitializer extends Driver {
    public static LoginPage loginPage;
    public static SignUpPage signUpPage;
    public static LanguagePage languagePage;
    public static UploadFilePage uploadFilePage;
    public static ProfilePage profilePage;
    public static EducationPage educationPage;
    public static ActivityPage activityPage;



    public static void initialize() {
        loginPage = new LoginPage();
        signUpPage = new SignUpPage();
        languagePage=new LanguagePage();
        uploadFilePage = new UploadFilePage();
        profilePage=new ProfilePage();
        activityPage=new ActivityPage();
        educationPage = new EducationPage();




    }

}
