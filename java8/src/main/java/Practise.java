import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by ashwani_arora on 7/18/2016.
 */
public class Practise {

    public static void main(String[] args) {
        Practise practise = new Practise();
        practise.run();
        String s = "0";
        System.out.println(new SimpleDateFormat("yyyyMMddhhmm").format(new Date()));


    }

    private void run()
    {
        Event event = new Event(1,"SNMP");
        Event event1 = new Event(2,"Internal");
        List<Event> list = new LinkedList();
        list.add(event);
        list.add(event1);

        List<Event> l=(list.stream().filter(eventObj->((Event)eventObj).getName().equals("Internal")).collect(Collectors.toList()));
        for(Event e : l)
        {
            System.out.println(e.getName());
        }

    }
    class Event{
        Event(int id,String name)
        {
                                this.id= id;
            this.name=name;
        }
        private  int id;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        private String name;


    }
}
