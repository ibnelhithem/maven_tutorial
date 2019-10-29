import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

@Mapper
public interface UserMapperStruct {
    UserMapperStruct INSTANCE = Mappers.getMapper(UserMapperStruct.class);
    User UserCommandToUser (UserCommand userCommand);
    UserCommand UserToUserCommand (User user);
}
