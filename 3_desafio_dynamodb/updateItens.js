const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB.DocumentClient();

const tableName = 'exemplo-tabela';
const hashKey = 'id';
const rangeKey = 'timestamp';

const params = {
  TransactItems: [
    {
      Update: {
        TableName: tableName,
        Key: {
          [hashKey]: '123',
          [rangeKey]: 123456789,
        },
        UpdateExpression: 'SET name = :name',
        ExpressionAttributeValues: {
          ':name': 'Maria',
        },
      },
    },
    {
      Update: {
        TableName: tableName,
        Key: {
          [hashKey]: '123',
          [rangeKey]: 987654321,
        },
        UpdateExpression: 'SET name = :name',
        ExpressionAttributeValues: {
          ':name': 'José',
        },
      },
    },
  ],
};

dynamodb.transactWrite(params, (err, data) => {
  if (err) {
    console.error('Erro ao executar transação:', err);
  } else {
    console.log('Transação executada com sucesso:', data);
  }
});