package generator;

import java.util.Random;

public class GeneratorPassword {

    private String password;
    private String generatorSupperLetter;
    private String generatorLowerLetter;
    private String generatorNumber;
    private String generatorSymbol;
    private String generatorPoints;
    private Random random;

    public GeneratorPassword() {
        this.password = "";
        this.generatorSupperLetter = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        this.generatorLowerLetter = "abcdefghijklmnopqrstuvwxyz";
        this.generatorNumber = "0123456789";
        this.generatorSymbol = "!@#$%^&*()_+";
        this.generatorPoints = ".,;:'\"[]{}|\\<>/?`~";
        this.random = new Random();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    
    public void generatePassword(int length) {
        StringBuilder passwordBuilder = new StringBuilder();
        String allCharacters = generatorSupperLetter + generatorLowerLetter +
         generatorNumber + generatorSymbol + generatorPoints;

        for (int i = 0; i < length; i++) {
            int index = random.nextInt(allCharacters.length());
            passwordBuilder.append(allCharacters.charAt(index));
        }
        this.password = passwordBuilder.toString();
    }

    public boolean verifyPassword(String inputPassword) {
        if (inputPassword.length() >= 8 && inputPassword.length() <= 56) {
            if (inputPassword.matches(".*[A-Z].*") && inputPassword.matches(".*[a-z].*") &&
                inputPassword.matches(".*\\d.*") && 
                inputPassword.matches(".*[!@#$%^&*()_+.,;:'\"\\[\\]{}|\\\\<>/?`~].*")) {
                return true;
            }
        }
        return false;
    }
}
