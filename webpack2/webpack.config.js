const path = require('path');

module.exports = {
    //Use the src/index.js file as entry point to bundle it. If the src/index.js file imports other JavaScript files, bundle them as well.
    entry:  path.resolve(__dirname, './src/index.js'),

    module: {
        rules: [
          {
            test: /\.(js)$/,
            exclude: /node_modules/,
            use: ['babel-loader']
          }
        ]
      },
      resolve: {
        extensions: ['*', '.js']
      },

    //  The bundled source code files shall result in a bundle.js file in the /public folder.
    output: {
      path: path.resolve(__dirname, './public'),
      filename: 'bundle.js'
    },
    // The /public folder will be used to serve our application to the browser.
    devServer: {
      static:  path.resolve(__dirname, './public'),
    }
  };