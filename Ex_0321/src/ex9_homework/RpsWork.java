package ex9_homework;

import java.util.Random;

public class RpsWork {
    private int wins = 0;
    private int draws = 0;
    private int losses = 0;
    private Random rnd = new Random();

    public void playRound(String userChoice) {
        String[] choices = {"가위", "바위", "보"};
        String computerChoice = choices[rnd.nextInt(3)];
        System.out.println("컴퓨터는 " + computerChoice + "를 냈습니다.");

        if (userChoice.equals(computerChoice)) {
            System.out.println("비겼습니다.");
            draws++;
        } else if (
            (userChoice.equals("r") && computerChoice.equals("가위")) ||
            (userChoice.equals("s") && computerChoice.equals("보")) ||
            (userChoice.equals("p") && computerChoice.equals("바위"))
        ) {
            System.out.println("당신이 이겼습니다!");
            wins++;
        } else {
            System.out.println("컴퓨터가 이겼습니다!");
            losses++;
        }
    }

    public boolean isValidChoice(String choice) {
        return choice.equals("s") || choice.equals("r") || choice.equals("p");
    }

    public String getSymbol(String choice) {
        switch (choice) {
            case "r": return "바위";
            case "s": return "가위";
            case "p": return "보";
            default: return "";
        }
    }

    public void printStats() {
        System.out.printf("%d승 %d무 %d패%n", wins, draws, losses);
    }

    public int getWins() {
        return wins;
    }

    public int getDraws() {
        return draws;
    }

    public int getLosses() {
        return losses;
    }
}