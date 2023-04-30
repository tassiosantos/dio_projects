const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB();

const tableName = 'exemplo-tabela';
const hashKey = 'id';
const rangeKey = 'timestamp';

const params = {
  AttributeDefinitions: [
    { AttributeName: hashKey, AttributeType: 'S' },
    { AttributeName: rangeKey, AttributeType: 'N' },
  ],
  KeySchema: [
    { AttributeName: hashKey, KeyType: 'HASH' },
    { AttributeName: rangeKey, KeyType: 'RANGE' },
  ],
  ProvisionedThroughput: {
    ReadCapacityUnits: 5,
    WriteCapacityUnits: 5,
  },
  TableName: tableName,
};

dynamodb.createTable(params, (err, data) => {
  if (err) {
    console.error('Erro ao criar tabela:', err);
  } else {
    console.log('Tabela criada com sucesso:', data);
  }
});
