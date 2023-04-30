const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB();

const tableName = 'exemplo-tabela';
const indexName = 'name-index';
const hashKey = 'name';

const params = {
  AttributeDefinitions: [
    { AttributeName: hashKey, AttributeType: 'S' },
  ],
  KeySchema: [
    { AttributeName: hashKey, KeyType: 'HASH' },
  ],
  ProvisionedThroughput: {
    ReadCapacityUnits: 5,
    WriteCapacityUnits: 5,
  },
  TableName: tableName,
  GlobalSecondaryIndexUpdates: [
    {
      Create: {
        IndexName: indexName,
        KeySchema: [
          { AttributeName: hashKey, KeyType: 'HASH' },
        ],
        Projection: {
          ProjectionType: 'ALL',
        },
        ProvisionedThroughput: {
          ReadCapacityUnits: 5,
          WriteCapacityUnits: 5,
        },
      },
    },
  ],
};

dynamodb.updateTable(params, (err, data) => {
  if (err) {
    console.error('Erro ao criar índice secundário:', err);
  } else {
    console.log('Índice secundário criado com sucesso:', data);
  }
});
