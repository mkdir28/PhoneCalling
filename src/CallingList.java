import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

public class CallingList {
    private static ArrayList<Call> calls = new ArrayList<>();
    private static ArrayList<Customer> customers = new ArrayList<>();

    public static ArrayList<Call> getCalls() {
        return calls;
    }

    public static ArrayList<Customer> getCustomers() {
        return customers;
    }

    public static void intialisation() {
        Customer.ourCustomers();
        Call.phoneCalls();
    }
    public static void printCalls() {
        for (Call call : calls) {
            System.out.println(call);
        }
    }

    //function for printing arraylists
    public static void printData(ArrayList<Customer> arrayList, int N, int arg) {
        System.out.println();
        switch (arg) {
            case 1:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " The longest time as callers: " +
                            arrayList.get(i).getLongestCaller());
                break;
            case 2:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " The longest time as callees: " +
                            arrayList.get(i).getLongestCallee());
                break;
            case 3:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " The largest number of other customers: " +
                            arrayList.get(i).getLargenum());
                break;
            case 4:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " Customers who received the calls " +
                            "from the largest number of other customers: " + arrayList.get(i).getRecivedcallfromcustomer());
                break;
            case 5:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " Customers who made the largest number of calls:  " +
                            arrayList.get(i).getLargenumcalls());
                break;
            case 6:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " Customers who received largest number of calls: " +
                            arrayList.get(i).getLargerrecivednumcalls());
                break;
            case 7:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " Customers who made the smallest number of calls:" +
                            arrayList.get(i).getSmallnumber());
                break;
            case 8:
                for (int i = 0; i < N; i++)
                    System.out.println(arrayList.get(i).toString() + " Customers who received the smallest number of calls: " +
                            arrayList.get(i).getSmallrecivednumcalls());
                break;
        }
        System.out.println();
    }

    //1
    public static void theLongesttimeCalers(int N) {
        for (Customer customer : customers)
            for (Call call : calls)
                if (customer == call.getCaller() && customer.getLongestCaller() < call.getDuration())
                    customer.setLongestCaller(call.getDuration());

        ArrayList<Customer> copy = new ArrayList<>(customers);

        for (int i = 0; i < copy.size(); i++)
            for (int j = 0; j < copy.size() - i - 1; j++)
                if (copy.get(j).getLongestCaller() < copy.get(j + 1).getLongestCaller()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }

        CallingList.printData(copy, N, 1);
    }

    //2
    public static void theLongesttimeCallee(int N) {
        for (Customer customer : customers)
            for (Call call : calls)
                if (customer == call.getCallee() && customer.getLongestCallee() < call.getDuration())
                    customer.setLongestCallee(call.getDuration());

        ArrayList<Customer> copy = new ArrayList<>(customers);

        for (int i = 0; i < copy.size(); i++)
            for (int j = 0; j < copy.size() - i - 1; j++)
                if (copy.get(j).getLongestCallee() < copy.get(j + 1).getLongestCallee()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }

        CallingList.printData(copy, N, 2);
    }

    //3
    public static void largetnumotherCustomers(int N) {
        for (Customer customer : customers) {
            for (Call call : calls) {
                if (customer == call.getCaller() && customer.getLargenum() < call.getDuration()) {
                    customer.setLargenum(call.getDuration());
                }
            }
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getLargenum() < copy.get(j + 1).getLargenum()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 3);
    }

    //4
    public static void recivedcallofthelargestnumofcustomer(int N) {
        for (Customer customer : customers) {
            for (Call call : calls) {
                if (customer == call.getCaller() && customer.getRecivedcallfromcustomer() < call.getDuration()) {
                    customer.setRecivedcallfromcustomer(call.getDuration());
                }
            }
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getRecivedcallfromcustomer() < copy.get(j + 1).getRecivedcallfromcustomer()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 4);
    }

    //5
    public static void largenumber(int N) {
        for (Customer customer : customers) {
            int madelarge = 0;
            for (Call call : calls) {
                if (customer == call.getCallee()) {
                    madelarge++;
                }
            }
            customer.setLargenumcalls(madelarge);
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getLargenumcalls() < copy.get(j + 1).getLargenumcalls()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 5);
    }

    //6
    public static void recivedslargenumber(int N) {
        for (Customer customer : customers) {
            int recivelarge = 0;
            for (Call call : calls) {
                if (customer == call.getCallee()) {
                    recivelarge++;
                }
            }
            customer.setLargerrecivednumcalls(recivelarge);
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getLargerrecivednumcalls() < copy.get(j + 1).getLargerrecivednumcalls()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 6);
    }

    //7
    public static void thesmallestnumofCalls(int N) {
        for (Customer customer : customers) {
            int madesmall = 0;
            for (Call call : calls) {
                if (customer == call.getCaller()) {
                    madesmall++;
                }
            }
            customer.setSmallnumber(madesmall);
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getSmallnumber() > copy.get(j + 1).getSmallnumber()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 7);
    }

    //8
    public static void recivedsmallnumber(int N) {
        for (Customer customer : customers) {
            int recivesmall = 0;
            for (Call call : calls) {
                if (customer == call.getCallee()) {
                    recivesmall++;
                }
            }
            customer.setSmallrecivednumcalls(recivesmall);
        }

        ArrayList<Customer> copy = new ArrayList<>(customers);
        for (int i = 0; i < copy.size() - 1; i++) {
            for (int j = 0; j < copy.size() - i - 1; j++) {
                if (copy.get(j).getSmallrecivednumcalls() > copy.get(j + 1).getSmallrecivednumcalls()) {
                    Customer temp = copy.get(j);
                    copy.set(j, copy.get(j + 1));
                    copy.set(j + 1, temp);
                }
            }
        }
        CallingList.printData(copy, N, 8);
    }

    //9
    public static void info(int N) {
        int madecalls = 0;
        int receivedcalls = 0;
        int totalduration = 0;
        for (Call call : calls) {
            if (call.getCaller().getId() == N) {
                madecalls++;
                totalduration += call.getDuration();
            } else if (call.getCallee().getId() == N) {
                receivedcalls++;
                totalduration += call.getDuration();
            }
        }
        System.out.println("List of N customers: " + N + "\n"
                + "All info:");
        System.out.println("Number of made calls: " + madecalls);
        System.out.println("Number of received calls: " + receivedcalls);
        System.out.println("Total duration: " + totalduration + " seconds");
    }

    public static void generateFile(String fileName) {
        int numofStrings = (int) (Math.random() * 200000) + 1;
        System.out.println(numofStrings);

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            for (int i = 0; i < numofStrings; i++) {
                fileWriter.write(CallingList.getCalls() + "\n");
            }
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("ERROR");
            e.printStackTrace();
        }
    }
}
