/**
 * @param {Object|Array} obj
 * @return {Object|Array}
 */
var compactObject = function(obj) {
    const data = Array.isArray(obj) ? obj.filter(Boolean) : obj;
    return Object.keys(data).reduce(
    (acc, key) => {
      const value = data[key];
      if (Boolean(value))
        acc[key] = typeof value === 'object' ? compactObject(value) : value;

      return acc;
    },
        Array.isArray(obj) ? [] : {}
  );
};