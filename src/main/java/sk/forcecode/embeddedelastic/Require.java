package sk.forcecode.embeddedelastic;

class Require {
    static void require(boolean condition, String message) {
        if (!condition) {
            throw new InvalidSetupException(message);
        }
    }
}
