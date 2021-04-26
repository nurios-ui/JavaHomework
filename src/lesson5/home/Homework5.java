package lesson5.home;

public class Homework5 {
    public static void main (String[] args) {
        Dog dog = new Dog(500, 10, 0.5f );
        Horse horse = new Horse(1500, 100, 3);
        Bird bird = new Bird(5,  0, 0.2f);
        Cat cat = new Cat(200, 0, 2);

        String win = " & succeeds!";
        String lose = " & fails.";
        String event;
        String eventResult;

        Animal[] arr = {dog, horse, bird, cat};
        float runTask = 300;
        float swimTask = 15;
        float jumpTask = 0.8f;

        for (int i = 0; i < arr.length; i++) {
            String name = arr[i].getAnimalType() + " can";
            event = " jump " + arr[i].getJumpHeight() + " meters. It tries to jump ";
            eventResult = (arr[i].jump(jumpTask)) ? win : lose;
            result(name, event, jumpTask, eventResult);


            event = " run " + arr[i].getJumpHeight() + " meters. It tries to run ";
            eventResult = (arr[i].run(runTask)) ? win : lose;
            result(name, event, runTask, eventResult);

            int swimResult = arr[i].swim(swimTask);
            event = " swim " + arr[i].getSwimLength() + " meters. It tries to swim ";
            eventResult = (swimResult == Animal.SWIM_OK) ? win : lose;

            if (swimResult == Animal.SWIM_NONE)
                eventResult = " but it cant swim!";
            result(name, event, swimTask, eventResult);
        }

    }

    private static void result(String name, String event, float eventTask, String evResult) {
        System.out.println(name + event+ eventTask + evResult);
    }
}
