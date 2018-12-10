package com.ocr.anthony;

import java.awt.*;
import java.util.Scanner;

public class Order {
    /**
     * Display all available menus in the restaurant.
     */
    public void displayAvailableMenu() {
        System.out.println("Choix menu");
        System.out.println("1 - poulet");
        System.out.println("2 - boeuf");
        System.out.println("3 - végétarien");
        System.out.println("Que souhaitez-vous comme menu ?");
    }

    /**
     * Display a selected menu.
     *
     * @param nbMenu The selected menu.
     */
    public void displaySelectedMenu(int nbMenu) {
        switch (nbMenu) {
            case (1):
                System.out.println("Vous avez choisi comme menu : poulet");
                break;
            case (2):
                System.out.println("Vous avez choisi comme menu : boeuf");
                break;
            case (3):
                System.out.println("Vous avez choisi comme menu : végétarien");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de menu parmi les choix proposés");
                break;
        }
    }


    /**
     * Display selected side depending on all sides enable or not
     * All sides enable : rice, vegetables or fries
     * No all sides enable : rice only or not
     *
     * @param nbSide         Chosen side
     * @param allSidesEnable True if all sides are enabled
     */
    public void displaySelectedSide(int nbSide, boolean allSidesEnable) {
        if (allSidesEnable) {
            switch (nbSide) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : légumes frais");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : frites");
                    break;
                case 3:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        } else {
            switch (nbSide) {
                case 1:
                    System.out.println("Vous avez choisi comme accompagnement : riz");
                    break;
                case 2:
                    System.out.println("Vous avez choisi comme accompagnement : pas de riz");
                    break;
                default:
                    System.out.println("Vous n'avez pas choisi d'accompagnement parmi les choix proposés");
                    break;
            }
        }
    }

    /**
     * Display selected drink : still water, sparkling water or soda
     *
     * @param nbDrink The chosen drink
     */
    public void displaySelectedDrink(int nbDrink) {
        switch (nbDrink) {
            case 1:
                System.out.println("Vous avez choisi comme boisson : eau plate");
                break;
            case 2:
                System.out.println("Vous avez choisi comme boisson : eau gazeuse");
                break;
            case 3:
                System.out.println("Vous avez choisi comme boisson : soda");
                break;
            default:
                System.out.println("Vous n'avez pas choisi de boisson parmi celles proposées");
                break;
        }
    }

    /**
     * Display available sides
     *
     * @param allSidesEnable True if all sides are enabled
     */
    public void displayAvailableSide(boolean allSidesEnable) {
        System.out.println("Accompagnements disponibles :");

        if (allSidesEnable) {
            System.out.println("1-Légumes frais");
            System.out.println("2-Frites");
            System.out.println("3-Riz");
        } else {
            System.out.println("1-Riz");
            System.out.println("2-Pas de riz");
        }

        System.out.println("Choisissez votre accompagnement");
    }

    /**
     * Display available drinks
     */
    public void displayAvailableDrink() {
        System.out.println("Boissons disponibles :");
        System.out.println("1-Eau plate");
        System.out.println("2-Eau gazeuse");
        System.out.println("3-Soda");
        System.out.println("Choisissez votre boisson");
    }

    /**
     * Run the entire menu, asking the customer what he wants to order
     */
    public void runMenu() {
        this.displayAvailableMenu();
        Scanner sc = new Scanner(System.in);
        int nbMenu = sc.nextInt();
        this.displaySelectedMenu(nbMenu);

        boolean allSidesEnable = nbMenu != 3;

        this.displayAvailableSide(allSidesEnable);
        int nbSide = sc.nextInt();
        this.displaySelectedSide(nbSide, allSidesEnable);

        if (nbMenu != 2) {
            this.displayAvailableDrink();
            int nbDrink = sc.nextInt();
            this.displaySelectedDrink(nbDrink);
        }
    }
}