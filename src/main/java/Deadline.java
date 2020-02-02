import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 * This class represents a Deadline task.
 */
public class Deadline extends Task {
    private LocalDate date;
    private String formattedDate;

    public Deadline(String description, boolean isDone, LocalDate date) {
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

    public String getFullDescription() {
        return "[D]" + super.getDescriptionWithIsDone() + " (by: " + this.formattedDate + ")";
    }
}