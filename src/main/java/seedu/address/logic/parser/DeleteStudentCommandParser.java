package seedu.address.logic.parser;

import static java.util.Objects.requireNonNull;
import static seedu.address.commons.core.Messages.MESSAGE_INVALID_COMMAND_FORMAT;

import seedu.address.commons.core.index.Index;
import seedu.address.logic.commands.AddStudentToTrainingCommand;
import seedu.address.logic.commands.DeleteStudentFromTrainingCommand;
import seedu.address.logic.parser.exceptions.ParseException;

/**
 * Parses input arguments and creates a new AddStudentToTrainingCommand object
 */
public class DeleteStudentCommandParser implements Parser<DeleteStudentFromTrainingCommand> {

    /**
     * Parses the given {@code String} of arguments in the context of the AddStudentToTrainingCommand
     * and returns an AddStudentToTrainingCommand object for execution.
     * @throws ParseException if the user input does not conform the expected format
     */
    public DeleteStudentFromTrainingCommand parse(String args) throws ParseException {
        requireNonNull(args);
        Index index;

        try {
            index = ParserUtil.parseIndex(args.substring(0, 2));
        } catch (ParseException | StringIndexOutOfBoundsException pe) {
            throw new ParseException(String
                    .format(MESSAGE_INVALID_COMMAND_FORMAT, AddStudentToTrainingCommand.MESSAGE_USAGE), pe);
        }

        try {
            String[] studentIndexes = args.substring(3).split(",");
            return new DeleteStudentFromTrainingCommand(index, studentIndexes);
        } catch (StringIndexOutOfBoundsException e) {
            throw new ParseException(String
                    .format(MESSAGE_INVALID_COMMAND_FORMAT, AddStudentToTrainingCommand.MESSAGE_USAGE));
        }
    }
}
