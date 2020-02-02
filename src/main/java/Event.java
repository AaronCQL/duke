import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class represents an Event task.
 */
public class Event extends Task {
    private LocalDate date;
    private String formattedDate;

    public Event(String description, boolean isDone, LocalDate date) {
        super(description, isDone);
        this.date = date;
        this.formattedDate = date.format(DateTimeFormatter.ofPattern("MMM d yyyy"));
    }

    public LocalDate getDate() {
        return this.date;
    }

    public String getFormattedDate() {
        return this.formattedDate;
    }

    @Override
    public String getFullDescription() {
        return "[E]" + super.getDescriptionWithIsDone() + " (at: " + this.formattedDate + ")";
    }
}