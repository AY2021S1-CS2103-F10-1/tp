package seedu.address.logic.parser;

import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import java.time.LocalDateTime;

import seedu.address.logic.commands.DeleteTrainingCommand;
import seedu.address.logic.parser.exceptions.ParseException;

public class DeleteTrainingCommandParser implements Parser<DeleteTrainingCommand> {
    /**
     * Parses the given {@code String} of arguments in the context of the TrainingCommand
     * and returns a TrainingCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteTrainingCommand parse(String args) throws ParseException {
        try {
            LocalDateTime trainingTime = ParserUtil.parseTraining(args).getDateTime();
            return new DeleteTrainingCommand(trainingTime);
        } catch (ParseException pe) {
            throw new ParseException(
                    String.format(MESSAGE_INVALID_COMMAND_FORMAT, DeleteTrainingCommand.MESSAGE_USAGE), pe);
        }
    }
}
