package org.uma.ed.dataestructure.priorityqueue;

public class EmptyPriorityQueueException extends RuntimeException {
    private static final long serialVersionUID = 2551856243837331348L;

    /**
     * Default constructor for the EmptyPriorityQueueException class.
     */
    public EmptyPriorityQueueException() {
        super();
    }

    /**
     * Constructor for the EmptyPriorityQueueException class that accepts a message.
     *
     * @param msg The detailed message about the exception.
     */
    public EmptyPriorityQueueException(String msg) {
        super(msg);
    }
}
