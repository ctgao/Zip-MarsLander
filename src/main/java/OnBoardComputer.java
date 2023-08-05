public class OnBoardComputer implements BurnStream {

    @Override
    public int getNextBurn(DescentEvent status) {
        //a = (speed * speed)/(2 * altitude)
        int burn = 0;
        double speeeeed = status.getVelocity();
        burn = (int) ((speeeeed * speeeeed) / (2. * status.getAltitude()));
        if(speeeeed == 0 && status.getAltitude() == 1){
            burn = -1;
        }
        System.out.println(100 + burn); /*hack!*/
        return 100 + burn;
    }

}
