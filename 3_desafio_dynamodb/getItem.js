const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB.DocumentClient();

const tableName = 'exemplo-tabela';
const hashKey = 'id';

const params = {
  TableName: tableName,
  Key: {
    [hashKey]: '123',
  },
};

dynamodb.get(params, (err, data) => {
  if (err) {
    console.error('Erro ao consultar item:', err);
  } else {
    console.log('Item consultado com sucesso:', data);
  }
});
