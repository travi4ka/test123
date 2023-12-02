package tests;

import com.codeborne.selenide.Configuration;

import static com.codeborne.selenide.Selenide.open;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class Test extends TestBase {
    @org.junit.jupiter.api.Test
    public void test() {
        Configuration.holdBrowserOpen = true;
        open("https://ya.ru");
        assertEquals(1, 1);

        apiBase.petsRequestApi.CreatePet();
        System.out.println(apiBase.petsRequestApi.petModelResponse.getName());
        System.out.println(apiBase.petsRequestApi.petModelResponse.getId());


    }

}
