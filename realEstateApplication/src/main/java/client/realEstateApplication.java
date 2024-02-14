package client;

import static client.applicationHelper.gatherUserInfo;


/**
 * Main class of the real estate application.
 * It starts the application by calling the gatherUserInfo method from the applicationHelper class.
 */
public class realEstateApplication {

    /**
     * Main method to start the real Estate application.
     *
     * @param args Command-line arguments (not used).
     */
    public static void main(String[] args) {
        System.out.println("Welcome to the Estate Buying Application!");
        gatherUserInfo();
    }


}
