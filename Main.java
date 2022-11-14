public class Main {
    public static void main(String[] args) {
        Inventory firstRare = new Inventory();
        Inventory secondRare = new Inventory();
        Inventory threeRare = new Inventory();
        Inventory fourRare = new Inventory();
        Inventory fiveRare = new Inventory();
        Inventory sixRare = new Inventory();
        Inventory sevenRare = new Inventory();

        firstRare.rare = "Consumer"; // белое Ширпотреб ( не используется )
        secondRare.rare = "Industrial"; // голубое Промышленное ( не используется )
        threeRare.rare = "Mil-Spec"; // синее Армейское ( используется )
        fourRare.rare = "Restricted"; // фиолетовое Запрещённое ( используется )
        fiveRare.rare = "Classifield"; // розовое Засекреченное ( используется )
        sixRare.rare = "Covert"; // красное Тайное ( используется )
        sevenRare.rare = "Rare Special Item"; // жёлтое Необычно редкое ( не используется )

        Inventory firstWeapon = new Inventory();
        Inventory secondWeapon = new Inventory();
        Inventory threeWeapon = new Inventory();
        Inventory fourWeapon = new Inventory();
        Inventory fiveWeapon = new Inventory();
        Inventory sixWeapon = new Inventory();
        Inventory sevenWeapon = new Inventory();
        Inventory eightWeapon = new Inventory();
        Inventory nineWeapon = new Inventory();
        Inventory tenWeapon = new Inventory();
        Inventory elevenWeapon = new Inventory();
        Inventory twelveWeapon = new Inventory();
        Inventory thirteenWeapon = new Inventory();
        Inventory fourteenWeapon = new Inventory();
        Inventory fifteenWeapon = new Inventory();
        Inventory sixteenWeapon = new Inventory();

        firstWeapon.weapon = "Sawed-Off 'Morris'"; //Армейское
        secondWeapon.weapon = "Glock-18 'Off World'"; //Армейское
        threeWeapon.weapon = "MP9 'Goo'"; //Запрещённое
        fourWeapon.weapon = "SG 553 'Phantom'"; //Запрещённое
        fiveWeapon.weapon = "CZ75-Auto 'Tacticat'"; //Запрещённое
        sixWeapon.weapon = "UMP-45 'Exposure'"; //Запрещённое
        sevenWeapon.weapon = "XM1014 'Ziggy'"; //Запрещённое
        eightWeapon.weapon = "PP-Bizon 'High Roller'"; //Засекреченное
        nineWeapon.weapon = "M4A1-S 'Leaded Glass'"; //Засекреченное
        tenWeapon.weapon = "R8 Revolver 'Llama Cannon'"; //Засекреченное
        elevenWeapon.weapon = "AK-47 'The Empress'"; //Тайное
        twelveWeapon.weapon = "P250 'See Ya Later'"; //Тайное
        thirteenWeapon.weapon = "Desert Eagle 'Code Red'"; //Тайное
        fourteenWeapon.weapon = "AK-47 'Neon Rider'"; //Тайное
        fifteenWeapon.weapon = "M9 Bayonet 'Doppler Ruby'"; //Тайное
        sixteenWeapon.weapon = "M9 Bayonet 'Fade'"; //Тайное

        Account account = new Account();
        account.cases = "Spectrum 2 Case";
        account.priceCases = 80;
        account.priceKeys = 200;
        account.balance = 300;
        account.remainingBalance = account.balance -
                (account.priceCases + account.priceKeys);

        int allPriceCaseAndKey = account.priceCases + account.priceKeys;

        Matchmaking matchmaking = new Matchmaking();
        matchmaking.rank = 19;
        matchmaking.skillGroup = "The Global Elite";
        matchmaking.wingmanSkillGroup = "Legendary Eagle";
        matchmaking.dangerZoneSkillGroup = "Lab Rat II";

        int randomWeaponFirstNum = 1;
        int randomWeaponSecondNum = 16;

        int resultRandomWeaponNum = randomWeaponFirstNum + (int) (Math.random() * randomWeaponSecondNum);
        System.out.println();

        if (account.balance >= allPriceCaseAndKey){

            System.out.println("Your rank: " + matchmaking.rank);
            System.out.println("Your Skill Group in Matchmaking: " + matchmaking.skillGroup);
            System.out.println("Your Skill Group in Wingman: " + matchmaking.wingmanSkillGroup);
            System.out.println("Your Skill Group in Danger Zone: " + matchmaking.dangerZoneSkillGroup);
            System.out.println();
            System.out.println("You bought and opened " + account.cases +
                    ". And you have left on the balance sheet " + account.remainingBalance + " Rub");
            System.out.println();
            System.out.println("==================================OPEN CASE==================================");

            switch (resultRandomWeaponNum){
                case 1:
                    System.out.println("Congratulations! You fell out " + firstWeapon.weapon +
                            ". Its rarity: " + threeRare.rare);
                    break;
                case 2:
                    System.out.println("Congratulations! You fell out " + secondWeapon.weapon +
                            ". Its rarity: " + threeRare.rare);
                    break;
                case 3:
                    System.out.println("Congratulations! You fell out " + threeWeapon.weapon +
                            ". Its rarity: " + fourRare.rare);
                    break;
                case 4:
                    System.out.println("Congratulations! You fell out " + fourWeapon.weapon +
                            ". Its rarity: " + fourRare.rare);
                    break;
                case 5:
                    System.out.println("Congratulations! You fell out " + fiveWeapon.weapon +
                            ". Its rarity: " + fourRare.rare);
                    break;
                case 6:
                    System.out.println("Congratulations! You fell out " + sixWeapon.weapon +
                            ". Its rarity: " + fourRare.rare);
                    break;
                case 7:
                    System.out.println("Congratulations! You fell out " + sevenWeapon.weapon +
                            ". Its rarity: " + fourRare.rare);
                    break;
                case 8:
                    System.out.println("Congratulations! You fell out " + eightWeapon.weapon +
                            ". Its rarity: " + fiveRare.rare);
                    break;
                case 9:
                    System.out.println("Congratulations! You fell out " + nineWeapon.weapon +
                            ". Its rarity: " + fiveRare.rare);
                    break;
                case 10:
                    System.out.println("Congratulations! You fell out " + tenWeapon.weapon +
                            ". Its rarity: " + fiveRare.rare);
                    break;
                case 11:
                    System.out.println("Congratulations! You fell out " + elevenWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case 12:
                    System.out.println("Congratulations! You fell out " + twelveWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case 13:
                    System.out.println("Congratulations! You fell out " + thirteenWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case 14:
                    System.out.println("Congratulations! You fell out " + fourteenWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case 15:
                    System.out.println("Congratulations! You fell out " + fifteenWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case 16:
                    System.out.println("Congratulations! You fell out " + sixteenWeapon.weapon +
                            ". Its rarity: " + sixRare.rare);
                    break;
                case default:
                    System.out.println("Такого оружия не существует!");
                    break;
            }
            System.out.println("=================================OPENED CASE=================================");
        }else {
            System.out.println("Вам не хватает баланса!");
        }
    }
}