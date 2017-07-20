import managers.UpTestBase;
import org.testng.Assert;
import org.testng.annotations.Test;


public class TestOlx extends UpTestBase{




    @Test
    public void testHomePageLogin(){
        getOlxHomePage().clickEnter();
        getOlxLogin().loginToOlx("bort7007@gmail.com", "qwe123asd");
        Assert.assertTrue(getOlxMyProfile().getMyProfileMenuName().toLowerCase().contains("bort7007"));
    }

    @Test(dependsOnMethods = {"testHomePageLogin"})
    public void testSearchPage(){
        getOlxHomePage().clickMainOlx();
        getOlxHomePage().clickMainSearchButton();
        getOlxSearchPage().yourSearch("PlayStantion 4 pro+ игры");
        getOlxSearchPage().highlightOff();
        System.out.println(getOlxSearchPage().getSearchResult());
        Assert.assertTrue(getOlxSearchPage().getSearchResult().contains("PlayStantion 4 pro+ игры"));

    }


    @Test(dependsOnMethods = {"testSearchPage"})
    public void testLogout(){
        getOlxHomePage().clickEnter();
        getOlxMyProfile().clickLogout();
        Assert.assertTrue(getOlxHomePage().getOlxHomePageName().contains("Мой профиль"));
        System.out.println(getOlxHomePage().getOlxHomePageName());
    }





}
