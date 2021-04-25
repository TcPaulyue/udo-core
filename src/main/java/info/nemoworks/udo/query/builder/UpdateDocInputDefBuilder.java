package info.nemoworks.udo.query.builder;

import java.util.ArrayList;
import java.util.List;

import graphql.language.InputValueDefinition;
import graphql.language.TypeName;
import info.nemoworks.udo.graphql.schema.GraphQLPropertyConstructor;

public class UpdateDocInputDefBuilder implements InputValueDefinitionBuilder {
    @Override
    public List<InputValueDefinition> inputValueDefinitionListBuilder(
            GraphQLPropertyConstructor graphQLPropertyConstructor) {
        List<InputValueDefinition> inputValueDefinitions = new ArrayList<>();
        inputValueDefinitions.add(
                new InputValueDefinition("content", new TypeName(graphQLPropertyConstructor.inputKeyWordInQuery())));
        inputValueDefinitions.add(new InputValueDefinition("udoi", new TypeName("String")));
        return inputValueDefinitions;
    }
}