package com.company;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import com.hp.lft.sdk.*;
import com.hp.lft.sdk.mobile.*;
import com.hp.lft.verifications.*;

import unittesting.*;

public class UFTDeveloperTest extends UnitTestClassBase {

    public UFTDeveloperTest() {
        //Change this constructor to private if you supply your own public constructor
    }

    @BeforeClass
    public static void setUpBeforeClass() throws Exception {
        instance = new UFTDeveloperTest();
        globalSetup(UFTDeveloperTest.class);
    }

    @AfterClass
    public static void tearDownAfterClass() throws Exception {
        globalTearDown();
    }

    @Before
    public void setUp() throws Exception {
    }

    @After
    public void tearDown() throws Exception {
    }

    @Test
    public void test_On_Android_AminoDemo() throws GeneralLeanFtException {

        Device device = MobileLab.lockDeviceById("06157df6236f0023");
//        Device device = MobileLab.lockDeviceById("e1698b55");

        Application aminoApplication = device.describe(Application.class, new ApplicationDescription.Builder()
                .identifier("com.narvii.amino.master.dev")
                .packaged(false).build());

        //aminoApplication.install();
        aminoApplication.launch();

        device.sendString("pherrera1967@gmail.com");
        device.sendKey(com.hp.lft.sdk.mobile.Keys.TAB);
        device.sendString("Polo123");
        /*
        EditField emailOrPhoneETEditField = aminoApplication.describe(EditField.class, new EditFieldDescription.Builder()
                .className("Input")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.EditText")
                .resourceId("com.narvii.amino.master.dev:id/emailOrPhoneET").build());
        emailOrPhoneETEditField.setFocus();

        emailOrPhoneETEditField.setText("pherrera1967@gmail.com");

        EditField passwordETEditField = aminoApplication.describe(EditField.class, new EditFieldDescription.Builder()
                .className("Input")
                .mobileCenterIndex(1)
                .nativeClass("android.widget.EditText")
                .resourceId("com.narvii.amino.master.dev:id/passwordET").build());
        passwordETEditField.setFocus();

        device.sendString("Polo123");
*/
        device.sendKey(com.hp.lft.sdk.mobile.Keys.TAB);

        Button lOGINButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/login")
                .text("LOG IN").build());
        lOGINButton.tap();

        aminoApplication.uninstall();

    }

        @Test
    public void test_On_Android_AminoBad() throws GeneralLeanFtException {

        Device device = MobileLab.lockDeviceById("06157df6236f0023");

        Application aminoApplication = device.describe(Application.class, new ApplicationDescription.Builder()
                .identifier("com.narvii.amino.master.dev")
                .packaged(false).build());

        aminoApplication.install();
        aminoApplication.launch();

        UiObject mobileObjectUiObject = aminoApplication.describe(UiObject.class, new UiObjectDescription.Builder()
                .className("View")
                .mobileCenterIndex(7)
                .nativeClass("android.view.ViewGroup").build());
        mobileObjectUiObject.pan(new java.awt.Point(1271, 1539), new java.awt.Point(1271, 809));
        mobileObjectUiObject.pan(new java.awt.Point(1312, 1508), new java.awt.Point(1312, 516));

        Label donTHaveAnAccountSignUpLabel = aminoApplication.describe(Label.class, new LabelDescription.Builder()
                .className("Label")
                .mobileCenterIndex(6)
                .nativeClass("android.widget.TextView")
                .resourceId("com.narvii.amino.master.dev:id/signupLinkTV")
                .text("Don’t have an account? Sign up").build());
        /*
        donTHaveAnAccountSignUpLabel.getLocation();
        donTHaveAnAccountSignUpLabel.getSize();

        TapArgs ta = new TapArgs();
        ta = donTHaveAnAccountSignUpLabel.tap(1);
        ta.setLocation();
        donTHaveAnAccountSignUpLabel.tap();
        */
        Button sIGNUPWITHEMAILButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/emailSignup")
                .text("SIGN UP WITH EMAIL").build());
        sIGNUPWITHEMAILButton.tap();

        Label january12009Label = aminoApplication.describe(Label.class, new LabelDescription.Builder()
                .className("Label")
                .mobileCenterIndex(3)
                .nativeClass("android.widget.TextView")
                .resourceId("com.narvii.amino.master.dev:id/birthday")
                .text("January 1, 2009").build());
        january12009Label.tap();

        UiObject uiObject = aminoApplication.describe(UiObject.class, new UiObjectDescription.Builder()
                .accessibilityId("02 January 2009")
                .className("View")
                .mobileCenterIndex(46)
                .nativeClass("android.view.View")
                .text("2").build());
        uiObject.tap();

        Button oKButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(1)
                .nativeClass("android.widget.Button")
                .resourceId("android:id/button1")
                .text("OK").build());
        oKButton.tap();

        Button nEXTButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/save")
                .text("NEXT").build());
        nEXTButton.tap();

        Button cONFIRMButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/confirm")
                .text("CONFIRM").build());
        cONFIRMButton.tap();

        device.sendString("myemail@myserver.com");

        Button nEXTButton1 = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(0)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/verify_email")
                .text("NEXT").build());
        nEXTButton1.tap();

        Button yesButton = aminoApplication.describe(Button.class, new ButtonDescription.Builder()
                .className("Button")
                .mobileCenterIndex(1)
                .nativeClass("android.widget.Button")
                .resourceId("com.narvii.amino.master.dev:id/alert_dialog_button")
                .text("Yes").build());
        yesButton.tap();

        device.sendString("123123");

        Label incorrectVerificationCodeLabel = aminoApplication.describe(Label.class, new LabelDescription.Builder()
                .className("Label")
                .text("Incorrect verification code")
                .nativeClass("android.widget.TextView")
                .resourceId("com.narvii.amino.master.dev:id/code_verification_error")
                .mobileCenterIndex(11).build());
        Verify.areEqual("Incorrect verification code", incorrectVerificationCodeLabel.getText(), "Verification", "Verify property: text");

        aminoApplication.uninstall();
    }
        @Test
    public void test_On_iPhone() throws GeneralLeanFtException {

        Device device = MobileLab.lockDeviceById("00008030-001C399A3AF0802E");

        Application homeApplication = device.describe(Application.class, new ApplicationDescription.Builder()
                .identifier("MC.Home")
                .packaged(false).build());
        Button advantageShoppingNIButton = homeApplication.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityId("AdvantageShoppingNI")
                .className("Button")
                .mobileCenterIndex(68)
                .nativeClass("XCUIElementTypeIcon")
                .text("AdvantageShoppingNI").build());
        advantageShoppingNIButton.tap();

        Application advantageShoppingNIApplication = device.describe(Application.class, new ApplicationDescription.Builder()
                .identifier("com.hpe.iShopping")
                .packaged(true).build());
        advantageShoppingNIApplication.launch();

        Table mobileListTable = advantageShoppingNIApplication.describe(Table.class, new TableDescription.Builder()
                .className("Table")
                .mobileCenterIndex(0)
                .nativeClass("UITableView").build());
        mobileListTable.select(0, 0);

        Button menuButton = advantageShoppingNIApplication.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityId("Menu")
                .className("Button")
                .mobileCenterIndex(2)
                .nativeClass("UIButton").build());
        menuButton.tap();

        mobileListTable.select(0, 0);

        Button sIGNINWITHFACEBOOKButton = advantageShoppingNIApplication.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityId("SIGN IN WITH FACEBOOK")
                .className("Button")
                .text("SIGN IN WITH FACEBOOK")
                .nativeClass("UIButton")
                .mobileCenterIndex(0).build());
        Verify.areEqual("SIGN IN WITH FACEBOOK", sIGNINWITHFACEBOOKButton.getText(), "Verification", "Verify property: text");

        Button menuButton1 = advantageShoppingNIApplication.describe(Button.class, new ButtonDescription.Builder()
                .accessibilityId("Menu")
                .className("Button")
                .mobileCenterIndex(4)
                .nativeClass("UIButton").build());
        menuButton1.tap();

        mobileListTable.select(0, 1);

        device.home();

        device.unlock();
    }

}