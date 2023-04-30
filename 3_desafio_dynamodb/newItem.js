const AWS = require('aws-sdk');
const dynamodb = new AWS.DynamoDB.DocumentClient();

const tableName = 'exemplo-tabela';
const hashKey = 'id';
const rangeKey = 'timestamp';

const item = {
  [hashKey]: '123',
  [rangeKey]: new Date().getTime(),
  name: 'João',
  age: 30,
};

const params = {
  TableName: tableName,
  Item: item,
};

dynamodb.put(params, (err, data) => {
  if (err) {
    console.error('Erro ao adicionar item:', err);
  } else {
    console.log('Item adicionado com sucesso:', data);
  }
});
