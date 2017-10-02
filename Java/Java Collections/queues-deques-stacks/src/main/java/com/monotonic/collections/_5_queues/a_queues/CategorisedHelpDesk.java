package com.monotonic.collections._5_queues.a_queues;

import com.monotonic.collections._5_queues.Category;
import com.monotonic.collections._5_queues.Customer;
import com.monotonic.collections._5_queues.Enquiry;

import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.ArrayDeque;
import java.util.Queue;
import java.util.function.Predicate;

import static com.monotonic.collections._5_queues.Category.PRINTER;

public class CategorisedHelpDesk
{
    private Queue<Enquiry> enquiries = new ArrayDeque<>();

    public boolean enquire(final Customer customer, final Category type)
    {
        return enquiries.offer(new Enquiry(customer, type));
    }

    public void processPrinterEnquiry()
    {
        Predicate<Enquiry> predicate = enq -> enq.getCategory() == PRINTER;
        final String message = "Is it out of paper?";

        processEnquiry(predicate, message, "No work to do, have some coffee!");
    }

    public void processGeneralEnquiry()
    {
        Predicate<Enquiry> predicate = enq -> enq.getCategory() != PRINTER;
        String message = "Have you tried turning it off and on again?";

        processEnquiry(predicate, message, "No work to do, let's have some coffee!");
    }

    private void processEnquiry(Predicate<Enquiry> predicate, String message, String x) {
        final Enquiry enquiry = enquiries.peek();
        if (enquiry != null && predicate.test(enquiry)) {
            enquiries.remove();
            enquiry.getCustomer().reply(message);
        } else {
            System.out.println(x);
        }
    }


    public static void main(String[] args)
    {
        CategorisedHelpDesk helpDesk = new CategorisedHelpDesk();

        helpDesk.enquire(Customer.JACK, Category.PHONE);
        helpDesk.enquire(Customer.JILL, PRINTER);

        helpDesk.processPrinterEnquiry();
        helpDesk.processGeneralEnquiry();
        helpDesk.processPrinterEnquiry();
    }
}
