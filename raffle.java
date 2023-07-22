public class raffle {
    public static void main(String[] args) {
        store store = new store();

        toy toy1 = new toy(1, "Lego", 10, 20);
        toy toy2 = new toy(2, "Робот", 200, 40);
        toy toy3 = new toy(3, "Футбольный мяч", 200, 90);
        toy toy4 = new toy(3, "Кукла Эльза", 50, 30);
        toy toy5 = new toy(3, "Пазл", 200, 90);
        toy toy6 = new toy(3, "игровая приставка", 10, 10);

        store.addToy(toy1);
        store.addToy(toy2);
        store.addToy(toy3);
        store.addToy(toy4);
        store.addToy(toy5);
        store.addToy(toy6);


        store.changeToyFrequency(1, 30);

        store.organizeRaffle();

        toy prizeToy = store.getPrizeToy();
        if (prizeToy != null) {
            System.out.println("Выигрышная игрушка: " + prizeToy.getName());
        }
    }
}