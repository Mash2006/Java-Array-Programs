import java.util.*;

public class JavaPriorityQueue {

    static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        PriorityQueue<Student> pq =
            new PriorityQueue<>((a, b) -> {

                int result =
                    Double.compare(b.cgpa, a.cgpa);

                if (result != 0)
                    return result;

                result =
                    a.name.compareTo(b.name);

                if (result != 0)
                    return result;

                return Integer.compare(a.id, b.id);
            });

        for (int i = 0; i < n; i++) {

            int id = sc.nextInt();
            String name = sc.next();
            double cgpa = sc.nextDouble();

            pq.add(new Student(id, name, cgpa));
        }

        while (!pq.isEmpty()) {

            Student s = pq.poll();

            System.out.println(
                s.name + " " +
                s.cgpa + " " +
                s.id
            );
        }

        sc.close();
    }
}
